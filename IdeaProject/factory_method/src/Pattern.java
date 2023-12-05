public class Pattern {
    private  int id;
    private  String pattern;
    private String result;
    private String relation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    @Override
    public String toString() {
        return "Pattern{" +
                "id=" + id +
                ", pattern='" + pattern + '\'' +
                ", result='" + result + '\'' +
                ", relation='" + relation + '\'' +
                '}';
    }
}
