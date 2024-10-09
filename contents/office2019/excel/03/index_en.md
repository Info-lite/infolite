---
layout: page_en
title: Data Processing using Spreadsheet Software (3)
date: 2016-03-15 17:03:47 +0900
purposes:
    - To understand the use of sorting and filtering
---

Excel also functions as a database. This section describes sorting and filtering.

In the following, we will use a [statistical table](./population.xlsx) . The original data were obtained from the national census in 2015.

-   [Table 1 Population, Population Change (2010-2015), Area and Population Density](http://www.e-stat.go.jp/SG1/estat/GL08020103.do?_csvDownload_&fileId=000007591144&releaseCount=2)

<div class="panel panel-default">
<div class="panel-body">
Note) The areas of the following islands, which were excluded from the survey based on the Census Decree (Government Ordinance No. 98 of 1980), are excluded from the calculations.
<ul>
<li>Habomai Islands(99.94km<sup>2</sup>)</li>
<li>Shikotan Island(253.33km<sup>2</sup>),Kunashiri Island(1498.83km<sup>2</sup>),and Etorofu Island(3184.04km<sup>2</sup>) (including the associated islands)</li>
<li>Takeshima Island(0.23km<sup>2</sup>)</li>
</ul>
As the boundaries of some of the islands have not yet been determined, they were estimated by the Statistics Bureau of the Ministry of Internal Affairs and Communications.
</div>
</div>


Sorting
------

We will sort the data.

### Simple Sort

Select the cells that will be the basis for sorting. Then, click on the [Home] ribbon - [Edit] group - [Sort and Filter]. Subsequently, click on [Sort Smallest to Largest] or [Sort Largest to Smallest] to sort.

{% screenshot az1_en.png "Select sorting and filtering" %}

The sorting then occurs.

{% screenshot az3_en.png "Sorting Results" %}

Numbers can also be sorted in addition to strings. The example below shows the sorting of "2010" in ascending order.

{% screenshot az4_en.png "Sorting" %}

### Normal Sorting

This method can be used for more complicated sorting.

First, click on the [Home] ribbon – [Edit] group – [Sorting and Filtering] – [Custom Sort].

{% screenshot sort1_en.png "Select Custom Sort" %}

The following window then opens:

{% screenshot sort2_en.png "Sorting Settings Window" %}

Here, multiple conditions can be sorted. A new condition key is added by clicking on [Add Level].

{% screenshot sort3_en.png "Adding sorting conditions (adding labels)" %}

The condition keys are applied in order from the top. You can also click on [Sort Options] to specify further options.

{% screenshot sort4_en.png "Detailed condition settings" %}


Filters
--------

Excel has a feature for extracting data called a filter.

### Auto Filter

First, select the appropriate cell in the table and click on the [Home] ribbon - [Edit] group - [Sort & Filter] - [Filter].

{% screenshot filter1_en.png "Select Filter" %}

{% screenshot _en_.png "Filter status" %}

This filter can be removed by pressing [Home] ribbon - [Edit] group - [Sort & Filter] - [Filter] again.

**It may not work if some of the cells in the row of field names are merged or have fields with the same name.**

Each field name is now marked with an ![](pic/filter.png) . Let's click on it.

{% screenshot filter3_en.png "Filter Setting Menu" %}

The menu that comes up allows the elements to be extracted and reordered. Here, click on [Numeric Filters] - [Top 10] to try it out.

{% screenshot top1_en.png "Select “Top” Ten" %}

The “Top Ten Auto Filter” dialog will appear. Set each item appropriately and click on [OK].

{% screenshot top2_en.png "Top Ten Settings" %}

Only the records that match the criteria are then displayed. As it is not easy to see, the records can be sorted in descending order. 
If you want to restore the original order, click on “Select All.” You can also do this by clicking on the [Home] ribbon - [Edit] group - [Sort & Filter] - [Clear].

{% screenshot top3_en.png "Remove Filters" %}

Next, try searching by text. Click on [Text Filter] – [Contains].

{% screenshot textfilter1_en.png "Select “Contains”" %}

{% screenshot textfilter2_en.png "Auto Filter - Setting Options" %}

As shown, it can be extracted using more complex criteria. Wildcards such as `?` and `*` can also be used.

{% screenshot textfilter4_en.png "Use of wildcards" %}

In the example above, I changed the condition from “contains” to “equals” and entered `*Shima*`. This means exactly the same thing as before. Click [OK].

{% screenshot textfilter3_en.png "Extraction of prefectures with “shima”" %}

Now, only those with “shima” in the prefecture name are extracted.

Additionally, the conditions in a table can be specified. 
First, create the following table in an appropriate location. This time, let's enter “K3” and “K4.”

{% screenshot textfilter7_en.png "conditional expression" %}

Next, click on the [Data] ribbon - [Sorting and Filtering] group - [Advanced].

{% screenshot textfilter5_en.png "Advanced sorting settings (pop-tip: specify complex conditions using advanced settings)" %}

Ensure that the [List Range] is already correctly selected. 
Specify the table you just created for the [Search Criteria Range].

{% screenshot textfilter6_en.png "Specifying Conditional Expressions" %}

If you leave the [Selected by] field set to [Within Selection], the table will be the same as before, with the parts of the table that do not fit the criteria hidden. 
If you select [Copy to another location], the "Criteria range" below will become active. 
This creates a new table with only the records that match the criteria. In the "Criteria range" field, specify the range for which you want to create a new table.

In this case, we will create a table at `A60:I60`.

{% screenshot textfilter8_en.png "Table extracted using conditional expressions" %}

This is a very useful feature.
There are other features such as pivot tables and VBA. Please check them out if you are interested.
