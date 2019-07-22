package edu.ksu.canvas.tests.gson;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import edu.ksu.canvas.CanvasTestBase;
import edu.ksu.canvas.impl.GsonResponseParser;
import edu.ksu.canvas.model.assignment.Assignment;

/**
 * Unit tests for custom serialization/deserialization functionality
 */
public class GsonDateParsingUTest extends CanvasTestBase {
    private static final long UNIX_TIME = 1486425500000l;
    private static final String ISO_DATE_STRING = "2017-02-06T23:58:20Z";
    private static final String SERIALIZED_ASSIGNMENT_EMPTY_DATE = "{\"name\":\"Assignment 1\",\"due_at\":\"\"}";
    private static final String SERIALIZED_ASSIGNMENT = "{\"name\":\"Assignment 1\",\"due_at\":\"" + ISO_DATE_STRING + "\"}";

    private Assignment assignment; //Dummy object to put dates into for parsing
    private Gson gson;

    @Before
    public void setUpGson() {
        gson = GsonResponseParser.getDefaultGsonParser(false);
        assignment = new Assignment();
        assignment.setName("Assignment 1");
    }

    @Test
    public void serializeDateToIsoFormat() throws Exception {
        assignment.setDueAt(new Date(UNIX_TIME));
        String jsonString = gson.toJson(assignment);

        assertThat(jsonString, containsString(ISO_DATE_STRING));
    }

    @Test
    public void deSerializeFromIsoFormat() throws Exception {
        Assignment assignment = gson.fromJson(SERIALIZED_ASSIGNMENT, Assignment.class);

        assertEquals("Date parsing failed", UNIX_TIME, assignment.getDueAt().getTime());
    }

    @Test
    public void nullDateNotSerialized() throws Exception {
        assignment.setDueAt(null);
        String jsonString = gson.toJson(assignment);

        assertThat(jsonString, not(containsString("due_at")));
    }

    //Gson by default throws an exception if you ask it to parse an empty string as a date.
    //Our custom type adapter should prevent this and put in a null date object instead
    @Test
    public void parseEmptyDateToNull() throws Exception {
        Assignment parsedAssignment = null;
        try {
            parsedAssignment = gson.fromJson(SERIALIZED_ASSIGNMENT_EMPTY_DATE, Assignment.class);
        } catch (JsonSyntaxException e) {
            Assert.fail("JSON parsing of a blank date caused an exception");
        }
        assertNull(parsedAssignment.getDueAt());
    }
}
