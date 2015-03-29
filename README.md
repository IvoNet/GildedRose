# The GildedRose kata #

see also here: https://github.com/martinsson/DevelopersAnonymous

[![YouTube Demo](http://img.youtube.com/vi/2hUZYeNXZ7Y/0.jpg)](http://www.youtube.com/watch?v=2hUZYeNXZ7Y)


In this version I will try to show the changes step by step.


## Step 0: 

```bash
git checkout master
```

This step is the origional code. This code is the code to be refactored.

## Step 1:

```bash
git checkout step_1
```

This step handles moving of a major part of the responsibility of the processing to the correct place.

Ask yourself the question. Who is responsible for the updateQuality method actions?

## Step 2:

```bash
git checkout step_2
```

Polymorphism baby! "One name to rule them all..."

## Step 3:

```bash
git checkout step_3
```

Wrap primitives... "Tell don't ask!"

## Step 4:

```bash
git checkout step_4
```

Look at me being beautiful code :-)



## Step 5:

```bash
git checkout step_5
```

Went a bit overboard and eliminated the name property also.


## Step 6:

```bash
git checkout step_6
```

We still had some "Feature Envy" by exposing the SellIn and Quality class by getter methods.

