
package com.example.coronatracker.jsonClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SpecificCountryCoronaAPI {

    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("countryInfo")
    @Expose
    private CountryInfo countryInfo;
    @SerializedName("cases")
    @Expose
    private String cases;
    @SerializedName("todayCases")
    @Expose
    private String todayCases;
    @SerializedName("deaths")
    @Expose
    private String deaths;
    @SerializedName("todayDeaths")
    @Expose
    private String todayDeaths;
    @SerializedName("recovered")
    @Expose
    private String recovered;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("critical")
    @Expose
    private String critical;
    @SerializedName("casesPerOneMillion")
    @Expose
    private String casesPerOneMillion;
    @SerializedName("deathsPerOneMillion")
    @Expose
    private String deathsPerOneMillion;
    @SerializedName("tests")
    @Expose
    private String tests;
    @SerializedName("testsPerOneMillion")
    @Expose
    private String testsPerOneMillion;
    @SerializedName("continent")
    @Expose
    private String continent;

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public CountryInfo getCountryInfo() {
        return countryInfo;
    }

    public void setCountryInfo(CountryInfo countryInfo) {
        this.countryInfo = countryInfo;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(String todayCases) {
        this.todayCases = todayCases;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(String todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

    public String getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public void setCasesPerOneMillion(String casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    public String getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(String deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    public String getTests() {
        return tests;
    }

    public void setTests(String tests) {
        this.tests = tests;
    }

    public String getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    public void setTestsPerOneMillion(String testsPerOneMillion) {
        this.testsPerOneMillion = testsPerOneMillion;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
