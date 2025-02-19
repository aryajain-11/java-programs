public enum DayC{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

    public boolean isWeekend(){
        if(this == Saturday || this == Sunday){
            return true;
        }
        else{
            return false;
        }
    }
}
