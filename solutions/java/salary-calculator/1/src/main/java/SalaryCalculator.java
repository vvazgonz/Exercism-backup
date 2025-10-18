public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double multi = (daysSkipped <5) ? 1: 0.85;
        return multi;
    }

    public int bonusMultiplier(int productsSold) {
        int bonusmulti = (productsSold >= 20) ? 13 : 10;
        return bonusmulti;
    }

    public double bonusForProductsSold(int productsSold) {
        double bonus = bonusMultiplier(productsSold);
        return bonus * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        int Base = 1000;
        double capped = ((Base * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold))>2000) ? 2000 : (Base * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold));
        return capped;
    } 
}
