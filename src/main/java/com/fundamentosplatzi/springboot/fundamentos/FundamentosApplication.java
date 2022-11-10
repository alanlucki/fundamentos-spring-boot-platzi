package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependecy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

    private ComponentDependecy componentDependecy;
    private MyBean myBean;

    private MyBeanWithDependency myBeanWithDependency;
    //@Autowired
    FundamentosApplication(
            @Qualifier("componentImplement02") ComponentDependecy componentDependecy ,
            MyBean myBean,
            MyBeanWithDependency myBeanWithDependency
    ) {
        this.componentDependecy = componentDependecy;
        this.myBean = myBean;
        this.myBeanWithDependency = myBeanWithDependency;
    }

    public static void main(String[] args) {
        SpringApplication.run(FundamentosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        componentDependecy.Saludar();
        myBean.Print();
        myBeanWithDependency.printWithDependency();
    }
}
