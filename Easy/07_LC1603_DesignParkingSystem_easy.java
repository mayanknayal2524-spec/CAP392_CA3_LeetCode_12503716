class ParkingSystem {
    int arr[]={0,0,0};
    public ParkingSystem(int big, int medium, int small) {
        arr[0]=big;
        arr[1]=medium;
        arr[2]=small;
    }
    public boolean addCar(int carType) {
        if(carType==1){
            if(arr[0]!=0){
                arr[0]--;
                return true;
            }
            else return false;
        }
        else if(carType==2){
            if(arr[1]!=0){
                arr[1]--;
                return true;
            }
            else return false;
        }
        else if(carType==3){
            if(arr[2]!=0){
                arr[2]--;
                return true;
            }
            else return false;
        }
        return false;
    }
}