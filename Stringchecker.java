class StrChecker implements StringChecker{
    @Override
    public boolean checkString(String s){
        if(s.length() > 5) {
            return true;
        }
        return false;
    }
}