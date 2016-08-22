package lessons.tests.vladimir.todomvc.smoke.v6;

import com.codeborne.selenide.ElementsCollection;
import lessons.tests.vladimir.todomvc.smoke.v6.testconfigs.AtToDoMVCPageWithClearedDataAfterEachTest;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Selenide.$$;
import static lessons.tests.vladimir.todomvc.smoke.v6.helpers.GivenHelpers.given;
import static lessons.tests.vladimir.todomvc.smoke.v6.helpers.GivenHelpers.TaskStatus.ACTIVE;

/**
 * Created by vladimir on 17.08.16.
 */
public class AtAllFilterTasksActivitiesTest extends AtToDoMVCPageWithClearedDataAfterEachTest {
    @Test
    public void testTasks(){
        given(ACTIVE,"b","c","d");
        assertTasksAre("b","c","d");

    }

    ElementsCollection tasks = $$("#todo-list>li");

    @Step
    private void assertTasksAre(String... texts) {
        tasks.shouldHave(exactTexts(texts));
    }

}
