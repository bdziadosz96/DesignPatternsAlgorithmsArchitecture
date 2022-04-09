package DesignPatterns.Mediator.Alarm;

import java.util.ArrayList;
import java.util.List;

class AlarmStation implements Mediator {
    private List<Alarm> alarmList = new ArrayList<>();

    @Override
    public void saveAlarm(Alarm alarm) {
        this.alarmList.add(alarm);
    }

    public void testAlarm() {
        alarmList.forEach(alarm -> System.out.println(" Register alarm name: " + alarm.getName()));
    }
}
