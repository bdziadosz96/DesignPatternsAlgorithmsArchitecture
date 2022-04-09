package DesignPatterns.Mediator.Alarm;

class Testing {
    public static void main(String[] args) {
        Mediator mediator = new AlarmStation();

        mediator.saveAlarm(new KitchenAlarm("Kitchen Alarm"));
        mediator.saveAlarm(new RadioAlarm("Radio Alarm"));

        mediator.testAlarm();
    }
}
