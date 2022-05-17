package ai.jobiak.collections;

import java.util.Comparator;

public class CourseComparator implements Comparator 
{

		@Override
		public int compare(Object o1, Object o2)
		{
			Course c1=(Course) o1;
			Course c2=(Course) o2;
			
			if(c1.getCourseid().compareTo(c2.getCourseid())>0)
			{
				return 1;
			}
			else if(c1.getCourseid().compareTo(c2.getCourseid())<0)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
}
