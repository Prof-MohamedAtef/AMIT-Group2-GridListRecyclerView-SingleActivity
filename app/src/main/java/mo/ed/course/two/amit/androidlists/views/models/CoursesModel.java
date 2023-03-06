package mo.ed.course.two.amit.androidlists.views.models;

import android.graphics.drawable.Drawable;

public class CoursesModel {
    String CourseTitle;
    float CoursePrice;
    String CourseTime;
    Drawable CoursePhoto;

    public CoursesModel(String courseTitle, float coursePrice, String courseTime, Drawable coursePhoto) {
        CourseTitle = courseTitle;
        CoursePrice = coursePrice;
        CourseTime = courseTime;
        CoursePhoto = coursePhoto;
    }

    public String getCourseTitle() {
        return CourseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        CourseTitle = courseTitle;
    }

    public float getCoursePrice() {
        return CoursePrice;
    }

    public void setCoursePrice(float coursePrice) {
        CoursePrice = coursePrice;
    }

    public String getCourseTime() {
        return CourseTime;
    }

    public void setCourseTime(String courseTime) {
        CourseTime = courseTime;
    }

    public Drawable getCoursePhoto() {
        return CoursePhoto;
    }

    public void setCoursePhoto(Drawable coursePhoto) {
        CoursePhoto = coursePhoto;
    }
}
