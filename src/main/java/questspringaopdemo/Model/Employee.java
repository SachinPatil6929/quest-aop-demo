package questspringaopdemo.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private Integer empId;
	private String empName;
	private String empAdd;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAdd=" + empAdd + "]";
	}
	
	
		
	

}
