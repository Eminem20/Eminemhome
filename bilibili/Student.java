package bilibili;
import java.io.Serializable;
@SuppressWarnings("serial")

public class Student implements Serializable {

		public String name;
		public String Price;

		public boolean equals(Object obj) {
		return equals((Student) obj);
		}

		public boolean equals(Student obj) {

		boolean isName = true;
		if (obj.name != null && !"".equals(obj.name)) {
		isName = name.equals(obj.name);
		}

		boolean isPrice = true;
		if (obj.Price != null && !"".equals(obj.Price)) {
		isPrice = Price.equals(obj.Price);
		}

		return isName && isPrice ;
		}

		public String[] toArray() {
		return new String[] { name, Price};
		}
		}