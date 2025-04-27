public class Meeting extends Task {
    private String topic;
    private String project;
    private String start;

    public Meeting(int id, String project, String start, String topic) {
        super(id);
        this.project = project;
        this.start = start;
        this.topic = topic;
    }

    public String getProject() {
        return project;
    }

    public String getStart() {
        return start;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }
}
