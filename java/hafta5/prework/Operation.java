package hafta5.prework;

public enum Operation {
    ADD{
        @Override
        public int apply(int num1, int num2) {
            return num1 + num2;
        }
    },
    SUBTRACT{
        @Override
        public int apply(int num1, int num2) {
            return num1 - num2;
        }
    };


    public abstract int apply(int num1,int num2);
}