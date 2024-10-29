---
layout: page_en
title: Basic Knowledge of Statistics 
date: 2016-09-30 10:02:24 +0900
purposes:
    - Learn about the basics of statistics
    - Obtain simple descriptive statistics using Excel 
---


How to Express Data Numerically 
--------------------------

To obtain quantified data, measurement is required. This process involves assigning a numerical value (number or symbol) to a phenomenon, which is a characteristic of the object. For example, if you express the gender (characteristics) of a person (universe) in a numerical value for the entire world, you are measuring gender. Measurement is based on a rule called a scale of measurement, and four scales must be used appropriately depending on the phenomenon you wish to measure. 

 
### Types of Scale of Measurement 

#### Qualitative data (represents specific attributes) 

<dl>
  <dt id="nominal_scale">Nominal scale</dt>
  <dd>Characteristics are classified categories that are meaningful only in data categories. No large-small or ordinal relationships exist. The type of data can be numeric or textual. Examples include gender and blood type.</dd>
  <dt id="ordinal_scale">Ordinal scale </dt>
  <dd>An ordinal scale is one in which only the rank order or size of the data is meaningful. The median is mainly used instead of the mean or standard deviation. Data types can be either numerical or textual, with the former being ordered by size and the latter by alphabetical order. Examples include ages and various scales. </dd>
</dl>

#### Quantitative data (data that can be obtained as a quantity) 

The scale of quantitative data is referred to as the continuous scale; two types of scale exist. 

<dl>
<dt id="interval_scale">Interval scale </dt>
<dd>A scale with ordinal information and equal intervals. Addition and subtraction are meaningful, but multiplication and division are not. Examples include temperature in degrees Celsius (℃) and time. </dd>
<dt id="ratio_scale">Ratio scale </dt>
<dd>In addition to the properties of an interval scale, a ratio scale can have a base point of zero. This type of scale is used for many events, such as test scores, height and weight, and so on. Numerical values can be used directly in calculations, and multiplication and division have meaning. </dd>
</dl>  
  
Absolute temperature (K) is a proportional scale because it has a base point of 0 (no moving atoms), while the temperature in degrees Celsius (℃) is an interval scale because it assigns a value of 0 to the freezing point of water for convenience, and that 0 is **not** a base point that represents “no temperature = no value.”   
  
  
Survey responses are another type of data that is often analyzed using statistics. When analyzing such data, numerical values such as “1: bad,” “2: normal,” and “3: good” can be assigned to the responses, and the rating of “normal” may be close to “bad” or “good,” depending on the person. From this fact, we can say this is an ordinal scale, since only the order is clear, although we cannot say it is equally spaced. However, in actual analysis, the <a href="#mean">mean</a>, <a href="#variance">variance</a>, <a href="#deviation">deviation</a>, and so on may be obtained based on the assigned numerical values. In such cases, they are treated as interval measures. 



Meaning of Descriptive Statistics 
----------------

For nominal and ordinal scales, the required statistics include the amount of data in each category or class (frequency) and the ratio of that frequency to the total number of data (relative frequency). The main summary statistics to be obtained for continuous scales include quantile, mean, median, mode, range, variance, standard deviation, skewness, and kurtosis. 
  
Each statistic is explained as follows. 
  
  
#### <span id="missing_value">Missing value</span>

If items exist for which no measurement values are available, a value that is not valid is entered, which is often left blank in Excel, or entered with a minus sign (-). 


#### <span id="sample_size">Sample size $N$</span>

The number of measurements other than missing values, can be obtained using <a href="https://support.office.com/ja-jp/article/COUNTA-関数-7dc98875-d5c1-46f1-9a82-53f3219e2509"><code>the COUNTA</code>function</a>.

#### <span id="summation">Summation</span>

The sum of all measurements other than missing values. 

$\displaystyle \left( x_1 + x_2 + \dots + x_N \right) = \sum_{i = 1}^N x_i$

$x_i$is the sample,$i$-th measurement, and $N$ is the size of the sample. For example, if the sample has five measurements, 1, 3, 4, 6, and 7, the total is 1 + 3 + 4 + 6 + 7 = 21. 

This can be obtained using <a href="https://support.office.com/ja-jp/article/SUM-関数-043e1c7d-7726-4e80-8f32-07b23e057f89">the <code>SUM</code>function</a>.

#### <span id="mean">Mean</span>

Represents the arithmetic mean of the measurements. The sum is then multiplied by the sample size $N$.   
  
divided by the sample size $N$.   

$\displaystyle \bar{x}=\frac{1}{N}\left ( x_1+x_2+_\cdots+x_N \right )$

$N$ is the size of the sample, and xi is the i-th measurement of the sample. For example, for 1, 3, 4, 6, and 7, the average is 21 ÷ 5 = 4.2.   
  
This can be obtained using <a href="https://support.office.com/ja-jp/article/AVERAGE-関数-047bac88-d466-426c-a32b-8f33eb960cf6">the <code>AVERAGE</code>function</a>.  

#### <span id="maximum">Maximum</span>

The maximum value of the measurement excluding missing values. For example, if the values are 1, 3, 4, 6, and 7, then 7 is the maximum value. 

 

This is obtained using<a href="https://support.office.com/ja-jp/article/MAX-関数-e0012414-9ac8-4b34-9a47-73e662c08098">the <code>MAX</code>function</a>.  

#### <span id="minimum">Minimum</span>

The minimum value of the measurement excluding missing values. For example, if the values are 1, 3, 4, 6, and 7, then 1 is the minimum value. 

This can be obtained using<a href="https://support.office.com/ja-jp/article/MIN-関数-61635d12-920f-4ce2-a70f-96f202dcc152">the <code>MIN</code>function</a>.  

#### <span id="range">Range</span>

Indicates the range over which the measured value is distributed. We can find this by the range R = maximum value - minimum value. For example, for 1, 3, 4, 6, 7, the range R = 7 - 1 = 6.   


#### <span id="quantile">Quantile</spam>

The boundary value between groups of measured values when arranged in order of magnitude and divided into groups of equal numbers of measured values. This is used to determine which values constitute what percentage of the total. This is called a percentile when dividing into 100 groups, and a quartile when dividing into four groups. The first quartile is the value that corresponds to the 25th percentile from the lowest quartile, and the third quartile is that to the 25th percentile from the highest quartile. The quartiles can be found using <a href="https://support.office.com/ja-jp/article/QUARTILE-EXC-関数-5a355b7a-840b-4a01-b0f1-f538c2864cad">the <code>QUARTILE.EXC</code>function</a>.  


#### <span id="median">Median</span>

Also referred to as the 50th percentile or second quartile, the median is the value that lies in the center of the whole when the measurements are arranged in order of magnitude. For example, if the values are 1, 3, 4, 6, and 7, then the median is 4. 

This can be obtained using <a href="https://support.office.com/ja-jp/article/MEDIAN-関数-d0916313-4753-414c-8537-ce85bdd967d2">rhe <code>MEDIAN</code>function</a>.

#### <span id="mode">Mode</span>

The value with the largest frequency among the measured values. For example, if the values are 1, 3, 4, 4, 6, and 7, then the mode value is 4 since this has the highest frequency. 

This can be obtained using <a href="https://support.office.com/ja-jp/article/MODE-SNGL-関数-f1267c16-66c6-4386-959f-8fba5f8bb7f8">the <code>MODE.SNGL</code>function</a>.

#### <span id="variance">Variance</span>

In Excel, this refers to unbiased variance. This is the **deviation**, the difference between each measurement and the mean, squared to remove the sign, and the sum of the squares of deviations divided by n-1. Variance is used to determine the degree of scatter of the data from the mean.

$\displaystyle V = \frac{ \sum_{i = 1}^N {\left( x_i - \bar{x} \right)}^2 }{n - 1}$

$V$ is the unbiased variance, which is an unbiased estimate of the population variance, $n$ is the sample size, $x_i$ is the $i$-th measurement of the sample, and $\bar{x} is the mean. For example, for 1, 3, 4, 6, and 7, the variance is {(1 - 4.2)<sup>2</sup> + (3 - 4.2)<sup>2</sup> + (4 - 4.2)<sup>2</sup> + (6 - 4.2)<sup>2</sup> + (7 - 4.2)<sup>2</sup>} ÷ (5 - 1) = 5.7.

We assume that the mean (population mean) of the population (data measured for the entire subject, e.g., the height of all Japanese) is unknown, and the (sample) mean $\bar{x}$ used to obtain the population variance, which is divided by $n - 1$ degrees of freedom.

This can be obtained uding <a href="https://support.office.com/ja-jp/article/VAR-S-関数-913633de-136b-449d-813e-65a00b2b990b">the <code>VAR.S</code>function</a>.

#### <span id="standard_deviation">Standard deviation</span>

In Excel, this is the square root of the unbiased variance $V. Link the variance, the standard deviation is a measure of the scatter and has the same units and order as the deviation.

$\hat{\sigma} = \sqrt{V} = \sqrt{\frac{1}{n-1}\sum ^{N}_{i=1}{(x_i-\bar{x})^2}}$

$\hat{\sigma}$ is the standard deviation (unbiased). For example, for 1, 3, 4, 6, and 7, the standard deviation (unbiased) is the square root of the variance, which is 2.387467... .
This can be obtained using  <a href="https://support.office.com/ja-jp/article/STDEV-S-関数-7d69cf97-0c1f-4acf-be27-f3e83904cc23">the <code>STDEV.S</code>function</a>.

#### <span id="skewness">Skewness</span>

Skewness is a measure of the asymmetry of the distribution of measured values.

* Skewness = 0 : symmetrical
* Skewness &gt; 0 : tail extends to right
* Skewness &lt; 0 : tail extends to left

{% screenshot 01_04warp_en.png "Skewness" %}


This can be obtained using <a href="https://support.office.com/ja-jp/article/SKEW-関数-bdf49d86-b1ef-4804-a046-28eaea69c9fa">the <code>SKEW</code>function</a>.

#### <span id="kurtosis">Kurtosis</span>

A measure of the length of the base of the distribution of measured values. 

* Kurtosis  = 0 : normal distribution 
* Kurtosis  &gt; 0 : flatter than the normal distribution
* Kurtosis  &lt; 0 : flatter than the normal distribution

{% screenshot 01_05sharp_en.png "Kurtosis" %}


This can be obtained using <a href="https://support.office.com/ja-jp/article/KURT-関数-bc3a265c-5da4-4dcb-b7fd-c237789095ab">the <code>KURT</code>function</a>.

#### <span id="coefficient_of_variation">Coefficient of variation</span>

This is the standard deviation divided by the mean and is a useful indicator for the relative comparison of dispersion after taking the mean into account.   

$s / \bar{x}$

$s$ is the standard deviation and $\bar{x}$ the mean.


#### <span id="standard_error">Standard error</span>

<a href="#standard_deviation">標準偏差</a>を<a href="#sample_size">標本の大きさ</a>$N$の平方根で割った値で、平均に関する検定や推定で用いられます。<a href="#mean">平均</a>の標準誤差とも呼ばれます。\

The standard deviation is divided by the square root of the sample size $N$. The standard error is used in tests and estimations related to the mean and is also called the standard error of the mean.

$s / \sqrt{N}$

$s$ is the standard deviation, and $N$ is the sample size.

Calculating Descriptive Statistics 
----------------

Learn about each of the descriptive statistics through practical exercises.

### Exercise 1

Use Excel to enter the following data and find the descriptive statistics.   

The table below presents some of the Japanese and Math test results for a school year. From these results, find an estimate of the grade level results.   

 

{% screenshot 01_06exQ1_en.png "The results of Japanese and math exams." %}

### Entering Data

&#9312; Open Excel and enter the data as follows:

{% screenshot Slide1.jpg "Entering data" %}

### Calculating Summation

&#9312; Calculate the Summation: Enter `=A2+B2` in the `C2` cell.

{% screenshot Slide2.jpg "Summation1" %}

{% screenshot Slide3.jpg "Summation2" %}

&#9313; Use AutoFill to sum up all the summations. Move the cursor over the [■] at the bottom right of the selected cell and stretch it down to "C21". 

{% screenshot Slide4.jpg "AutoFill Sumation." %}

&#9314; The summation could be calculated.

{% screenshot Slide5.jpg "After AutoFill summation" %}

### How to Obtain Descriptive Statistics

Use Excel functions to find descriptive statistics.

&#9312; Enter =AVERAGE(A2:A21) in "F2" to calculate the mean score for the Japanese.

{% screenshot Slide6.jpg "Average score" %}

&#9313; Similarly, enter the following.

-   "F3" : `=STDEV(A2:A21)/SQRT(COUNT(A2:A21))` （standard error）
-   "F4" : `=MEDIAN(A2:A21)` （median）
-   "F5" : `=MODE(A2:A21)` （mode）
-   "F6" : `=STDEV(A2:A21)` （standard deviation）
-   "F7" : `=VAR(A2:A21)` （variance）
-   "F8" : `=KURT(A2:A21)` （kurtosis）
-   "F9" : `=SKEW(A2:A21)` （skewness）
-   "F10" : `=MAX(A2:A21)-MIN(A2:A21)` （range）
-   "F11" : `=MIN(A2:A21)` （minimum value）
-   "F12" : `=MAX(A2:A21)` （maximum value）
-   "F13" : `=SUM(A2:A21)` （summation）
-   "F14" : `=COUNT(A2:A21)` （sample number）

{% screenshot Slide7.jpg "Manual Calculation of Descriptive Statistics" %}

&#9314;  Use AutoFill to find the descriptive statistics for arithmetic and sums. Select "F2" to "F14" and grag [■] in the bottom right corner to stretch it to "H14"  

{% screenshot Slide8.jpg "AutoFill of Descriptive Statistics" %}

&#9315; Descriptive statistics for math and sum were calculated.

{% screenshot Slide9.jpg "After AutoFill of Descriptive Statistics" %}


Excel Analysis Tools
-----------------

So far, descriptive statistics have been obtained using Excel functions, but these can also be obtained using an add-in called Analysis Tools. 

Analysis Tools is available from the [Data] ribbon - [Analysis] tab - [Data Analysis]. 

{% screenshot Slide10.jpg "Analysis Tools" %}

If [Analyze Data] is not displayed, please refer to the following page to add the add-in. 


{% appendix_en ../appendix/addin_en.html "Analysis Tools" %}


Calculating Descriptive Statistics Using Analysis Tools 
------------------------------------

Use the Analysis Tools to find descriptive statistics.

### Performing Data Analysis

&#9312; Click on the [Data] ribbon - [Analysis] tab - [Data Analysis]. 

{% screenshot Slide10.jpg "Analysis Tools" %}

&#9313; Select “Descriptive Statistics” and click on [OK]. 

{% screenshot Slide11.jpg "Descriptive Statistics 1" %}


&#9314; As an input range, select the range of data for which you want to obtain the basic statistics. In this case, select “A1” to “C21.” 

&#9315; Check “Labels in first Row.” 

&#9316; Specify the output destination in the Output Options. This time, select “Output Range” and specify the “J1” cell. 

&#9317; Check the “Summary statistics” check box. 

{% screenshot Slide12.jpg "Descriptive Statistics 2 " %}

&#9318; Press [OK] to output the descriptive statistics. 

{% screenshot Slide13.jpg "Descriptive Statistics 3 " %}

&#9319; Ensure that the outputs are consistent with those obtained using functions. 


Frequency Distributions and Histograms 
----------------------

Although characteristics such as the variability and distribution of data can be determined numerically from descriptive statistics, the use of frequency distributions is also useful. 

A frequency distribution divides data into several classes and shows how many data are in each class. A tabular representation of this is called a **Frequency Distribution Table**. A bar chart showing the frequency distribution is known as a **Histogram**, which are useful for visually understanding the distribution of data. 


### Exercise 2

Prepare a frequency distribution table and a histogram for the area of each of the 23 wards of Tokyo. 

{% screenshot table1_en.png "Table1: Area of each of the 23 wards of Tokyo (square kilometers) " %}

{% screenshot table2_en.png "Table2:Classes" %}

[Tokyo Metropolitan Government map of wards, cities, towns, and villages in Tokyo](http://www.metro.tokyo.jp/tosei/tokyoto/profile/gaiyo/kushichoson.html)

### Entering Data

&#9312;  Enter the data from Table 1 and the Classes from Table 2 into Excel. 

{% screenshot dataentry_En.png "Data Entry " %}

### Creating Frequency Distribution Tables and Histograms 

&#9312; Click on the [Data] ribbon – [Analysis] tab – [Data analysis]. 

&#9313; Select “Histogram” and click OK. 

{% screenshot Slide14.jpg "Histogram 1" %}

&#9314; Select a range of data as the Input range. In this case, select “A1” to “A24.” 

&#9315; Select the classes as the Bin Range. Here, select “B1” to “B6.”

&#9316; Specify the output destination in the Output option. In this case, select “Output Range” and specify the “D1” cell. 

&#9317; Check the “Labels” and “Chart Output” checkboxes. 

&#9318; Press [OK] to output a Frequency Distribution Table and Histogram. 

{% screenshot Slide15.jpg "Histogram Output Result" %}

Three districts up to 10 km², nine from 11 km² to 20 km², two from 21 km² to 30 km², four from 31 km² to 40 km², two from 41 km² to 50 km², and “More” refers to 51 km² and above, resulting in three. 

 
Task 1 
-----

From the table in Exercise 1, set the classes (data intervals) for Japanese, Math, and Summation freely and enter them into Excel. 

 


Task 2
-----

Use the Analysis Tools to create a Frequency Distribution Table and Histogram based on the data in Table 1 and the classes (data intervals) you have set. 

