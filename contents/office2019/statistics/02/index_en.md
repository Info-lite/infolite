---
layout: page_en
title: Population and sample, normal distribution and t-distribution
date: 2016-09-30 10:02:24 +0900
purposes:
    - Learn the definitions of population and sample
    - Estimate population and sample means and variances using Excel
flowplayer_conf:
    - embed: false
    - ratio: 0.75
---

<div>
    <div class="panel panel-info">
    <div class="panel-heading">Study videos related to this course</div>
        <div class="panel-body">
            <p>One [Explanatory video] regarding the class content of this course is available.</p>
            <p><font color="red">Note: The video may not be played if many people are playing it simultaneously. Please watch the video at different times.</font></p>

<div id="class_movie"></div>
<p><button type="button" class="btn btn-info pull-right" data-toggle="modal" data-target="#overviewModal">
<!--<p><button type="button" class="btn btn-info" data-toggle="modal" data-target="#overviewModal">-->
<i class="fa fa-play-circle-o fa-lg"></i>&nbsp;Explanatory Video
</button>
<div class="modal fade" id="overviewModal" tabindex="-1" role="dialog" aria-labelledby="overviewModalLabel" aria-hidden="true">
<div class="modal-dialog"><div class="modal-content">
<div class="modal-header">
<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
<span class="modal-title" id="overviewModalLabel">Explanatory Video</span>
</div>
<div class="modal-body">
<div class="flowplayer is-splash color-light img-responsive" style="max-width:854px;">
<video>
<source type="video/mp4" src="https://lit.fpark.tmu.ac.jp/mov/st02_sample.mp4">
</video>
</div>
</div>
</div></div>
</div></p>
        </div>
    </div>
</div>

Population and Sample Description
--------------------

We encounter various types of data daily, and in some cases, we are required to obtain the data ourselves.

For example, we wish to determine college students’ monthly food expenses. 
However, we cannot examine all university students in Japan; therefore, we use a limited amount of data (e.g., 100 or 200 students). In this case, all college students nationwide are known as the **population**, and the data extracted (sampled) from the population are known as the <span id=“sample”>**sample**</span>.

Samples must be extracted randomly (random sampling) to avoid data bias.

{% screenshot 03_01data_en.png "Population mean" %}

Presented below is a simplified example to provide clarity.

Suppose that TV station A conducts a survey and discovers that the cabinet’s approval rating is 40%. This implies that TV station A randomly selected 2,000 people from the entire Japanese population and instructed them to answer a questionnaire; among those 2,000 people, 40% supported the cabinet. This does not reflect the overall approval rating of the Japanese people. However, in terms of statistics, it can be assumed to be the overall approval rating of the Japanese people.

In other words, the population is Japanese, and the sample is the 2000 people who participated in the survey.


Estimation of population variance
------------------

### Variance

The number that indicates the scatter extent of data around the mean is known as the **variance**. It can be obtained as follows:

variance = (sum of (data - mean) $^2$ ) $\div$ (sample size)
  
Suppose that we repeat the process of randomly selecting a sample of size n from the population with variance $\sigma^2$ and calculating its variance (unadjusted variance). We know that the mean of the sample variance will not match the variance of the population (population variance) but instead will be slightly smaller. 
Therefore, if the sample size minus one is placed in the denominator, then the value will be slightly larger owing to the smaller denominator, which is considered to be consistent with the population variance. This becomes an unbiased estimate of the population variance and, hence, the sample variance.

sample variance = (sum of (data - mean) $^2$) $\div$ (sample size - 1)

The sample size minus one is known as **the degree of freedom**.

In retrospect, one may realize that the formula for variance introduced earlier is for the unadjusted variance.

population variance = (sum of (data - mean) $^2$) $\div$ (sample size)

### Calculation of two variances using Excel


Next, we calculate the population variance (sample variance) and unadjusted variance in Excel.

Please open the Excel file used in Exercise 1 in the previous lecture. It should look like this:

{% screenshot 03_02table_en.png "Descriptive statistics" %}

First, calculate the values of the variables that constitute the formula.

&#9312; Select Column D, and from the [Home] ribbon - [Cells] tab, [Insert]; click [Insert Sheet Columns] twice.

{% screenshot 03_03var01_en.png "Insert Sheet Columns 1" %}

{% screenshot 03_04var02_en.png "Insert Sheet Columns 2" %}

&#9313; Enter “difference from the mean” for “D1” and “difference squared” for “E1.” Adjust the column width to render the entered text visible.

{% screenshot 03_05var03_en.png "Adjust the column width" %}

&#9314; Enter = `A2-$H$2` for “D2.” For an absolute cell reference [F4], please refer to documents available at [Data Processing using Spreadsheet Software (2)](../../excel/02/index_en.html).

{% screenshot 03_06var04_en.png "Difference from mean 1" %}

{% screenshot 03_07var05_en.png "Difference from mean 2" %}

&#9315; Enter `=D2^2` for “E2.”

{% screenshot 03_08var06_en.png "Square of difference 1" %}

{% screenshot 03_09var07_en.png "Square of difference 2" %}

&#9316; Select cells “D2” and “”E2,” and use Autofill to calculate the difference from the average and the square of the difference for all the English scores.

{% screenshot 03_10var08_en.png "Difference from mean and square of difference using AutoFill (before)" %}

{% screenshot 03_11var09_en.png "Difference from mean and square of difference using AutoFill (after)" %}

&#9317; In cell “D22,” enter “Sum of squares of differences.”

{% screenshot 03_12var10_en.png "Inserting a label" %}

&#9318; Enter `=sum(E2:E21)` in cell “E22.”

{% screenshot 03_13var11_en.png "Sum of squares of differences (before)" %}

{% screenshot 03_14var12_en.png "Sum of squares of differences (after)" %}

We are now ready to calculate the variance.

&#9319; Enter “sample variance” and "unadjusted variance" in cells “G17” and “G18”, respectively.

{% screenshot 03_15var13_en.png "Sample variance” and “unadjusted variance" %}

&#9320; Enter `=E22/(H14-1)` in cell “H17.”

{% screenshot 03_16var14_en.png "Sample variance" %}

{% screenshot 03_17var15_en.png "Sample variance (after calculation)" %}

Thus, the sample variance is obtained.

&#9321; Next, enter `=E22/H14` in cell “H18.”.

{% screenshot 03_18var16_en.png "Unadjusted variance" %}

{% screenshot 03_19var17_en.png "Unadjusted variance (after)" %}

Thus, the unadjusted variance is obtained.

Now, compare the values in cell “M8” with those in cells “H17” and “H18.”

{% screenshot 03_20var18_en.png "Variances after calculation" %}

Thus, the variance calculated using data analysis is the sample variance. This must be emphasized when using variance from the data analysis.

In addition, the VAR function, which we applied earlier, is a function of variance, and the following function is provided separately to calculate the variance.

In the case of Japanese,

-   Sample variance : `=VAR.S(A2:A21)`
-   Unadjusted variance : `=VAR.P(A2:A21)`

If we focus on the units of variance, the variance of data in centimeters (cm), for example, would have units of square centimeters because of squaring in the equation.

The square root (root) of the variance, which is a unit-matched value, is **the standard deviation** (SD).

The calculation steps performed in Excel listed below. The square root is calculated using the `SQRT` function.

&#9312; Enter “standard deviation (sample)” in cell “G20” and “standard deviation (unadjusted)” in cell “G21.” Adjust the column width to render the text visible.

{% screenshot 03_21sd01_en.png "Standard deviation (sample) and standard deviation (unadjusted)" %}

&#9313; Enter `=SQRT(H17)` in cell “H20.”

{% screenshot 03_22sd02_en.png "Standard deviation (Sample)" %}

{% screenshot 03_23sd03_en.png "Standard deviation (sample) after calculation" %}

&#9314; Obtain the standard deviation of the sample in “H21” using AutoFill.

{% screenshot 03_24sd04_en.png "Standard deviation (unadjusted)" %}

For the variance, the function `STDEV`, which we practiced earlier, or the standard deviation obtained from the data analysis, is an estimate of the population standard deviation. Notably, we must distinguish between this function and a function that calculates the standard deviation of a sample.

In the case of Japanese,

-   Standard deviation (sample) : `=STDEV(A2:A21)`
-   Standard deviation (unadjusted) : `=STDEV.P(A2:A21)`


Estimation of population mean
------------------

### Interval Estimation

Next, we consider the population and sample means. As with the variance, the mean obtained from a randomly selected sample (sample mean) is not necessarily equal to the mean of the population because the data from which each sample is selected are different. However, unlike the variance, the sample mean can be averaged further to be approximately equal to the population mean.

In other words, using the sample mean, we can estimate the range of values that includes the population mean. This is known as **interval estimation**.

### Calculation of t-value using Excel

### Setting significance level $\alpha$

For example, to examine the difference between two means, we first hypothesize that the two population means are the same. This is known as **the null hypothesis**.

A value ($z$-value, $t$-value, etc.) known as the test statistic is calculated from the data, and the probability that the test statistic occurs is calculated. 
Subsequently, a reference value is established to compare with this probability, which is known as **the significance level** ($\alpha$). When the probability of a test statistic occurring is less than this significance level, we regard it as a rare occurrence instead of a coincidence; that is, something statistically significant has occurred, and the null hypothesis is false. Thus, the null hypothesis is rejected, and we cannot conclude that no difference is indicated between the two population means. Two significance levels exist, i.e., 5% ($\alpha$ = 0.05) and 1% ($\alpha$ = 0.01), with the 1% significance level being more stringent than the 5% significance level.

{% screenshot 03_25mean_en.png "Significance level" %}

### $t$-distribution table

The test statistic $t$-value can be obtained using the following formula:

\begin{align}
  t = \frac{\bar{x}-\mu_0}{\frac{\hat{\sigma}}{\sqrt{n}}}
\end{align}

Here, $\bar{x}$ is the sample mean, $\mu_0$ the population mean, $\hat{\sigma}$ the standard deviation (sample), and $n$ the sample size.

{% screenshot 03_28t3_en.png "$t$-distribution with three degrees of freedom" %}

{% screenshot 03_29t100_en.png "$t$-distribution with 100 degrees of freedom" %}

The $t$-distribution shows a graph similar to that shown above. As presented in the figure above, the $t$-distribution is a bell-shaped distribution similar to the normal distribution; however, its shape changes with the number of degrees of freedom (sample size - 1).

For example, when the sample size is small, the graph assumes a flat shape, whereas when the sample size is large, the graph approaches a normal distribution.

Thus, the $t$-value depends on the probability (95% or 99%) and degree of freedom. 
Therefore, we refer to the $t$-distribution table below.

{% screenshot 03_30ttable_en.png "$t$-distribution table" %}

### Calculation using Excel

Next, we calculate the $t$-values using Excel. 
In this exercise, we use the probability and degrees of freedom (TINV) function.

&#9312; In cell “G23,” enter the significance level $\alpha$ and $t$-value (95% confidence interval) from cell “G24.” Enter 0.05 in cell “H23” to use the 95% probability in this case.

{% screenshot 03_31analysis01_en.png "Significance level α and $t$-value (95% confidence interval)" %}

&#9313; Enter `=TINV(H23, H14-1)` in cell “H24” cell to calculate the $t$-value.

{% screenshot 03_32analysis02_en.png "$t$-value (95% confidence interval)" %}

{% screenshot 03_33analysis03_en.png "$t$-value (95% confidence interval) after calculation" %}

Verify the calculated $t$-value based on the $t$-distribution table (probability: 95%; degrees of freedom: 19).

### Confidence interval of population mean

The confidence interval, $(1 - \alpha) \times$100%, of the population mean $\mu$ is obtained as follows:

\begin{align}
  \bar{x}-t_{n-1}(\alpha)\frac{\hat{\sigma}}{\sqrt{n}}<\mu<\bar{x}+t_{n-1}(\alpha)\frac{\hat{\sigma}}{\sqrt{n}}
\end{align}

Here, $\bar{x}$ is the sample mean, $\hat{\sigma}$ the standard deviation (sample), and $n$ the sample size. Meanwhile, $t_{n-1}(\alpha)$ indicates the 100$\times \alpha$% point of the $t$-distribution with $n-1$ degrees of freedom; it is considered a critical value of two-tailed probability $\alpha$.

A more concise expression is as follows:

sample mean $- t \times$ standard deviation of the sample mean (standard error) $< \mu <$ sample mean $+ t \times$ standard deviation of the sample mean (standard error)

Here, the sample mean is an estimation of the population mean.

For example, a 95% confidence interval indicates that when a sample is repeatedly obtained from the population and interval estimation is performed 100 times using the formula above, then the range includes the population mean approximately 95 times.

Next, we obtain the confidence interval.

1.  Enter “lower confidence threshold $\mu$L” in cell “G25” and “upper confidence threshold $\mu$U” in cell “G26.”
2.  Enter `=H2-H24*H3` in cell “H25.”
3.  Enter `=H2+H24*H3` in cell “H26.”

From the sample data shown in a table, we discovered a 95% confidence interval of $52.45 < \mu < 70.24$.

The larger the sample size, the narrower is the confidence interval and the more similar is the sample mean is to the population mean.


Task 1
-----

Use the procedures described in this lecture to obtain a confidence interval for the mean math score.

Task 2
-----

We examined the price of gasoline (regular: 1 liter) in an area and discovered the following: Obtain the confidence interval for the population mean of the prices.

{ 126.4 yen, 127.3 yen, 126.9 yen, 127.4 yen, 125.8 yen, 127.2 yen, 127.1 yen, 128.0 yen }

