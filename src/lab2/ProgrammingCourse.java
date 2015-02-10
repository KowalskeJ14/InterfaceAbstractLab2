/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author kowal_000
 */
public interface ProgrammingCourse {
    public void setCourseName(String courseName);
    public String getCourseName();
    public void setCourseNumber(String courseNum);
    public String getCourseNumber();
    public void setCredits(double credits);
    public double getCredits();
    public void testCredits(double credits);
    public void testCourseNum(String courseNum);
    public void testPrereqs(String prereqs);
    public void testCourseName(String courseName);
}
