import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.Group;


public abstract class FibGraph extends Application
{
		 long stop;
		 long passes;

		 @Override
		 public void start(Stage stage)
		 {
		    stage.setTitle("Recursion vs Iteration");
		    
		    //defining the axes
		    final NumberAxis xAxis = new NumberAxis();
		    final NumberAxis yAxis = new NumberAxis();
		    xAxis.setLabel("Passes");
		    yAxis.setLabel("Time in Nanoseconds);
		    
		    //creating the chart
		    final LineChart<Number,Number> lineChart = new LineChart<Number,Number>(xAxis,yAxis);          
		    lineChart.setTitle("Fibonacci Sequence Method Efficiency");
		    
		    //defining a series
		    XYChart.Series series = new XYChart.Series();
		    XYChart.Series series = new XYChart.Series();
		    series.setName("Recursion");
		    series.setName("Iteration");
        
		    //Runs a for loop to insert both arrays stored times into the newly created series
		    for(int i = 0; i < 50; i++)
		    {
		      Recursion.getData().add(new XYChart.Data(i,recursiveArray[i]));
		      Iteration.getData().add(new XYChart.Data(i,iterativeArray[i]));
		    }
        
        	Scene scene  = new Scene(lineChart,800,800);
        	lineChart.getData().add(series);
       
        	stage.setScene(scene);
        	stage.show();
		 }
	
	//Launch
	public static void main(String[] args)
	{
		launch(args);
	}
}