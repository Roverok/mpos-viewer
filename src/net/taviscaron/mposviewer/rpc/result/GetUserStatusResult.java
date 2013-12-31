package net.taviscaron.mposviewer.rpc.result;

import com.google.gson.annotations.SerializedName;

/**
 * getuserstatus RPC response
 * @author Andrei Senchuk
 */
public class GetUserStatusResult {
    public static class Shares {
        public int valid;
        public int invalid;

        public int getInvalid() {
            return invalid;
        }

        public void setInvalid(int invalid) {
            this.invalid = invalid;
        }

        public int getValid() {
            return valid;
        }

        public void setValid(int valid) {
            this.valid = valid;
        }
    }

    public static class Transactions {
        @SerializedName("Credit")
        private double credit;

        @SerializedName("Debit_AP")
        private double debit;

        @SerializedName("Debit_MP")
        private double manualDebit;

        @SerializedName("Donation")
        private double donation;

        @SerializedName("TXFee")
        private double txFee;

        public double getCredit() {
            return credit;
        }

        public void setCredit(double credit) {
            this.credit = credit;
        }

        public double getDebit() {
            return debit;
        }

        public void setDebit(double debit) {
            this.debit = debit;
        }

        public double getDonation() {
            return donation;
        }

        public void setDonation(double donation) {
            this.donation = donation;
        }

        public double getTxFee() {
            return txFee;
        }

        public void setTxFee(double txFee) {
            this.txFee = txFee;
        }

        public double getManualDebit() {
            return manualDebit;
        }

        public void setManualDebit(double manualDebit) {
            this.manualDebit = manualDebit;
        }
    }

    private String username;
    private Shares shares;
    private int hashrate;
    private float sharerate;
    private Transactions transactions;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Shares getShares() {
        return shares;
    }

    public void setShares(Shares shares) {
        this.shares = shares;
    }

    public int getHashrate() {
        return hashrate;
    }

    public void setHashrate(int hashrate) {
        this.hashrate = hashrate;
    }

    public float getSharerate() {
        return sharerate;
    }

    public void setSharerate(float sharerate) {
        this.sharerate = sharerate;
    }

    public Transactions getTransactions() {
        return transactions;
    }

    public void setTransactions(Transactions transactions) {
        this.transactions = transactions;
    }
}
