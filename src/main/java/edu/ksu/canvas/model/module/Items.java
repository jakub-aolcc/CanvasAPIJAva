package edu.ksu.canvas.model.module;

public class Items {

    private Integer id;
    private String title;
    private Integer position;
    private Integer indent;
    private Boolean quizLti;
    private String type;
    private Integer moduleId;
    private String htmlUrl;
    private String pageUrl;
    private String url;
    private CompletionRequirement completionRequirement;
    private Boolean published;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getIndent() {
        return indent;
    }

    public void setIndent(Integer indent) {
        this.indent = indent;
    }

    public Boolean getQuizLti() {
        return quizLti;
    }

    public void setQuizLti(Boolean quizLti) {
        this.quizLti = quizLti;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CompletionRequirement getCompletionRequirement() {
        return completionRequirement;
    }

    public void setCompletionRequirement(CompletionRequirement completionRequirement) {
        this.completionRequirement = completionRequirement;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }
}
