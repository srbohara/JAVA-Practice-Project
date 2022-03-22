package com.coreJava.unitTestDemo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class GraderTest {
    @Test
    void determineLetterGradeTest() {
        Grader grader=new Grader();
        Assert.assertEquals('A',grader.determineLetterGrade(100));
    }


    class MyStaticDemoTest {

        @Test
        void testStaticMockVoid() {
            try (MockedStatic<Dummy> dummy = Mockito.mockStatic(Dummy.class)) {
                //dummy.when(Dummy::foo).thenReturn("mocked");
                //dummy.when(() -> Dummy.foo(anyString())).thenReturn("mockedValue");

               /* assertEquals("mocked", Dummy.foo());
                assertEquals("mockedValue", Dummy.foo("para"));
                dummy.verify(() -> Dummy.foo());*/
                //dummy.verify(() -> Dummy.foo(anyString()));
            }
        }

        public   class Dummy {
            public int testing() {
                return var1.length();
            }

             String var1 = null;

             String foo() {
                return "foo";
            }

             String foo(String var2) {
                var1 = var2;
                return "SUCCESS";
            }
        }
    }

}