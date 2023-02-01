package com.rohit.app;

import com.rohit.app.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAppE
{
    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff", 100000.0),
            new Employee(2, "Bill", 200000.0),
            new Employee(3, "Mark", 300000.0)
    };
    public Stream<Employee> getEmployeeArray(){
        return Stream.of(arrayOfEmps);
    }
    public Stream<Employee> getEmployeeList(){
        List<Employee> empList = Arrays.asList(arrayOfEmps);
        return empList.stream();
    }
    public Stream<Employee> getEmployeeData(){
        return  Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]);
    }

    public Stream<Employee> getEmployeeStreamBuilder(){
        Stream.Builder<Employee> empStreamBuilder = Stream.builder();

        empStreamBuilder.accept(arrayOfEmps[0]);
        empStreamBuilder.accept(arrayOfEmps[1]);
        empStreamBuilder.accept(arrayOfEmps[2]);

        Stream<Employee> empStream = empStreamBuilder.build();
        return  empStream;
    }
}
