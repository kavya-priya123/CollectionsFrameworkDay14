package ai.jobiak.collections;

import java.util.Objects;
public class Course { //implements Comparable<Object>{	// without implementing Comparable,we get Exception -->java.lang.ClassCastException: class ai.jobiak.collections.Course cannot be cast to class java.lang.Comparable (ai.jobiak.collections.Course is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
		private String courseid;
		private String title;
		private int durationHours;
		private double fees;

		public Course() {
			// TODO Auto-generated constructor stub
		}

		public Course(String courseid, String title, int durationHours, double fees) {

			this.courseid = courseid;
			this.title = title;
			this.durationHours = durationHours;
			this.fees = fees;
		}

		public String getCourseid() {
			return courseid;
		}

		public void setCourseid(String courseid) {
			this.courseid = courseid;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getDurationHours() {
			return durationHours;
		}

		public void setDurationHours(int durationHours) {
			this.durationHours = durationHours;
		}

		public double getFees() {
			return fees;
		}

		public void setFees(double fees) {
			this.fees = fees;
		}

		@Override
		public int hashCode() {
			return Objects.hash(courseid, durationHours, fees, title);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Course other = (Course) obj;
			return Objects.equals(courseid, other.courseid) && durationHours == other.durationHours
					&& Double.doubleToLongBits(fees) == Double.doubleToLongBits(other.fees)
					&& Objects.equals(title, other.title);
		}

		@Override
		public String toString() {
			return "Course [courseid=" + courseid + ", title=" + title + ", durationHours=" + durationHours + ", fees="
					+ fees + "]";
		}
/*		@Override
		public int compareTo(Object o) {
			Course ref=(Course) o;
			   //invoking obj           //invoked
			if(this.courseid.compareTo(ref.getCourseid())<0) {
				return -1;
			}
			else if(this.courseid.compareTo(ref.getCourseid())==0) {
				return 0;
			}
			else if(this.courseid.compareTo(ref.getCourseid())>0) {
				return 1;
			}
			return 0;
		}
*/
	}
