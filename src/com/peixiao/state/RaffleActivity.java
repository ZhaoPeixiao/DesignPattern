package com.peixiao.state;

/**
 * @Author: Peixiao Zhao
 */
public class RaffleActivity {
    State state = null;
    int count = 0;

    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState  = new DispenseState(this);
    State dipenseOutState = new DispenseOutState(this);

    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    public void debuctMoney(){
        state.deductMoney();
    }

    public void raffle(){
        if (state.raffle()) {
            state.dispensePrize();
        }
    }

    public int getCount(){
        int current = count;
        count --;
        return current;
    }


    public void setCount(int count) {
        this.count = count;
    }

    public State getState() {
        return state;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public State getDipenseOutState() {
        return dipenseOutState;
    }


    public void setState(State state) {
        this.state = state;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public void setDipenseOutState(State dipenseOutState) {
        this.dipenseOutState = dipenseOutState;
    }
}
