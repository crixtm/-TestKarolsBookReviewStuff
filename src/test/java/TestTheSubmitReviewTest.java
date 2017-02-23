import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
public class TestTheSubmitReviewTest extends AcceptanceTest {
    @Override
    public InjectableStepsFactory stepsFactory(){
        return new InstanceStepsFactory(configuration(), new TestTheSubmitReviewSteps());
    }

}
