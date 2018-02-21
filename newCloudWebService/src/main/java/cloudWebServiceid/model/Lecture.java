package cloudWebServiceid.model;

public class Lecture {
    private long lectureID;
    private String lectureName;
    private String notes;
    private String assoicateMaterial;

    public Lecture(){}

    public Lecture(long lectureID, String lectureName, String notes, String assoicateMaterial) {
        this.lectureID = lectureID;
        this.lectureName = lectureName;
        this.notes = notes;
        this.assoicateMaterial = assoicateMaterial;
    }

    public Long getLectureID() {
        return lectureID;
    }

    public void setLectureID(Long lectureID) {
        this.lectureID = lectureID;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAssoicateMaterial() {
        return assoicateMaterial;
    }

    public void setAssoicateMaterial(String assoicateMaterial) {
        this.assoicateMaterial = assoicateMaterial;
    }
}
