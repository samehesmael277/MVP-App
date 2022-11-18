package com.sameh.mvpapp.ui;

import com.sameh.mvpapp.model.DataBase;
import com.sameh.mvpapp.model.NumberModel;

public class NumbersPresenter {

    NumbersResultView numbersResultView;
    NumberModel numberModel = getNumbersFromDataBase();

    public NumbersPresenter(NumbersResultView numbersResultView) {
        this.numbersResultView = numbersResultView;
    }

    public void getPlusResult() {
        int res = numberModel.getFirstNumber() + numberModel.getSecondNumber();
        numbersResultView.onGetPlusResult(res);
    }

    public void getDivResult() {
        int res = numberModel.getFirstNumber() / numberModel.getSecondNumber();
        numbersResultView.onGetDivResult(res);
    }

    public void getMultiResult() {
        int res = numberModel.getFirstNumber() * numberModel.getSecondNumber();
        numbersResultView.onGetMultiResult(res);
    }

    private NumberModel getNumbersFromDataBase() {
        return DataBase.getNumbers();
    }

}
