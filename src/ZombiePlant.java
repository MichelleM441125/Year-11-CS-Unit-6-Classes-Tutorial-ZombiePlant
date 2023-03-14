public class ZombiePlant {

    int potencyRequired;
    int treatmentsNeeded;

    public ZombiePlant(int m, int i)
    {
       potencyRequired = m;
       treatmentsNeeded = i;
    }

    public ZombiePlant()
    {

    }

    public int getPotencyRequired() {
        return potencyRequired;
    }

    public void setPotencyRequired(int potencyRequired) {
        this.potencyRequired = potencyRequired;
    }

    public int getTreatmentsNeeded() {
        return treatmentsNeeded;
    }

    public void setTreatmentsNeeded(int treatmentsNeeded) {
        this.treatmentsNeeded = treatmentsNeeded;
    }

    public int treatmentsNeeded()
    {
        int result = getTreatmentsNeeded();
        return result;
    }

    public boolean isDangerous()
    {
        boolean result = false;
        if(getTreatmentsNeeded() == 0)
        {
            result = false;
        }
        else if(getTreatmentsNeeded() > 0 || getTreatmentsNeeded() < 0 )
        {
            result = true;
        }
        return result;
    }

    public void treat(int num)
    {

        if(getTreatmentsNeeded() > 0)
        {
            if(num <= potencyRequired && num > 0)
            {
                treatmentsNeeded -= 1;
            }
            if (num > potencyRequired)
            {
                treatmentsNeeded += 1;
            }
        }
        else if(getTreatmentsNeeded() == 0)
        {
            if(num > potencyRequired)
            {
                treatmentsNeeded += 1;
            }
        }

    }



}
