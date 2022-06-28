package cuc_Run_From_Here;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Eclipse-Workspace\\19Stage_WL19\\src\\test\\resources\\features"
		,glue = {"cuc_Steps","cuc_Utilities"}
		,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		,monochrome = true
		,tags = "@Close_Announcement or @Open_Site"
		)

public class Run_From_Here_Runner {

}