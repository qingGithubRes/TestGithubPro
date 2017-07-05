package www.test_github_pro.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by little_bug on 2017/7/5.
 */
public class HelloGithub extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("savedInstanceState = [" + savedInstanceState + "]");
        System.out.println("修改代码");
        System.out.println("修改了部分代码");
    }
}
