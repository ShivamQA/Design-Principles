package emp;

public class EmpController {
		Employee model;
		Empview view;

		public EmpController(Employee model, Empview view){
			this.model = model;
			this.view = view;
		}

		public void setEmpName(String name){
			model.setEName(name);		
		}

		public String getEmpName(){
			return model.getEName();		
		}

		public void setEmployeeno(int Eno){
			model.setEmpno(Eno);		
		}

		public int getEmployeeno(){
			return model.getEmpno();		
		}
		public void setEmpage(int age){
			model.setEage(age);		
		}

		public int getEmpage(){
			return model.getEage();		
		}

		public void displayview(){				
			view.EmpDetails(getEmployeeno(), getEmpName(), getEmpage());
		}	
		public static void main(String[] args) {
				Employee model = new Employee();
		      Empview view = new Empview();

		      EmpController controller = new EmpController(model,view);

		      


		      controller.setEmpName("John");
		      controller.setEmployeeno(10);
		      controller.setEmpage(60);
		      controller.displayview();   
		}
}
