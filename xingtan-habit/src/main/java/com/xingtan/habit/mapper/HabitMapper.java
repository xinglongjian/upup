package com.xingtan.habit.mapper;

import com.xingtan.habit.entity.Habit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HabitMapper {

    List<Habit> getAll();
    Habit getHabitById(@Param("id") long id);
    List<Habit> getHabitByTypeId(@Param("habitTypeId") long habitTypeId);
    void insertHabit(Habit habit);
    void updateHabit(Habit habit);
    void deleteHabit(@Param("id") long id);
}
