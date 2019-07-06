import javax.swing.JOptionPane;

public class ArrayDemo {

	public static void main(String[] args) {
		int numSalaries = Integer.parseInt(JOptionPane.showInputDialog("Enter number of salaries"));
		while (numSalaries < 0) {
			numSalaries = Integer.parseInt(JOptionPane.showInputDialog("Error! Re-enter a positive number"));
		}
		// It's important to validate inputs here as negative inputs will cause problems

		double[] salaries; // Step 1: Declare name and type of array and its elements
		salaries = new double[numSalaries]; // Step 2: Create and assign compatible array with elements

		int i = 0; // this loop is very important when dealing with most array based questions
		while (i < numSalaries) {
			// Assigning a value from the keyboard to the current element, salaries[i]
			salaries[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter salary for Job " + i));
			i = i + 1;
		}

		String[] jNames = new String[numSalaries];
		i = 0;
				
		while (i < numSalaries) {
			// Retrieve and display value at i (current element)

			jNames[i] = JOptionPane.showInputDialog("Please enter the Name of Job " + i);
			JOptionPane.showMessageDialog(null, jNames[i] + " currently earns: $" + salaries[i]);
			i = i + 1;
			
			
			
		}
		

		for(i=0; i<salaries.length; i++) {
			 double total = 0;
			total = total + salaries[i]; //this is where it's going wrong!!!!
			double average = total / salaries.length;//this is working fine?
			double sum = 0;
			sum = sum / salaries[i]; // unable to add/average data with JOptionPane!! 
			JOptionPane.showMessageDialog(null, "The sum is " + total);
			System.out.format("The average is: %.2f", average);//doesn't print unless %.nf is included
		}
		
	}
}
