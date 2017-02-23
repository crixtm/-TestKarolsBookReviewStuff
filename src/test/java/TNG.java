import org.jbehave.core.ConfigurableEmbedder;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.StoryPathResolver;
import org.testng.annotations.Test;

import static java.util.Arrays.asList;

/**
 * Created by Krisztian_Barabas on 21.02.2017.
 */
public abstract class TNG extends ConfigurableEmbedder {

    @Test
    public void run() throws Throwable {
        Embedder embedder = configuredEmbedder();

        StoryPathResolver pathResolver = embedder.configuration().storyPathResolver();
        String storyPath = pathResolver.resolve(this.getClass());
        try {
            embedder.runStoriesAsPaths(asList(storyPath));
        } finally {
            embedder.generateCrossReference();
        }
    }

}
