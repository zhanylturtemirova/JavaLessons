public class Author {
    private String name;
    private int year;
    public Author(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getAuthorInfo(){
        return "Name: " +this.name + ","+ "Birth Year: " + this.year+".";
    }
}
