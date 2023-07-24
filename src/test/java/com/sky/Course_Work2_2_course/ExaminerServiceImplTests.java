package com.sky.Course_Work2_2_course;

import com.sky.Course_Work2_2_course.exceptions.NumberOfQuestionsExceededException;
import com.sky.Course_Work2_2_course.question.Question;
import com.sky.Course_Work2_2_course.services.ExaminerService;
import com.sky.Course_Work2_2_course.services.ExaminerServiceImpl;
import com.sky.Course_Work2_2_course.services.QuestionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//  создадим наш тестовый класс и присоединим к нему расширение Mockito:
@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTests {
    private ExaminerService examinerService;
    @Mock
    private QuestionService questionService;

    @BeforeEach
    public void SetUp(){
        examinerService = new ExaminerServiceImpl(questionService);
    }

    @Test
    public void getQuestionsTest() {

        Set<Question> questions = new HashSet<>();

        questions.add(new Question("пойдете в гости?", "пойдем"));
        questions.add(new Question("вы уходите?", "уходим"));
        questions.add(new Question("что делаете?", "учимся"));
        questions.add(new Question("когда освободитесь?", "никогда"));

        Question randomQuestion = new Question("что делаете?", "учимся");

        Mockito.when(questionService.getAll()).thenReturn(questions);
        Mockito.when(questionService.getRandomQuestion()).thenReturn(randomQuestion);

        Set<Question> expected = new HashSet<>();
        expected.add(new Question("что делаете?", "учимся"));

        Set<Question> actual = examinerService.getQuestions3(1);

        assertEquals(expected, actual);
    }

    @Test
    public void getQuestionsTestException(){
        Set<Question> questions= new HashSet<>();
        questions.add(new Question("который час?", "15.25"));
        questions.add(new Question("опаздываете?", "нет"));

        Mockito.when(questionService.getAll()).thenReturn(questions);

        assertThrows (NumberOfQuestionsExceededException.class, () -> examinerService.getQuestions3(4));
    }

}
