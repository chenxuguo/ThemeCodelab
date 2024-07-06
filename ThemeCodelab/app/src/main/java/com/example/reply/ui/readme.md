# What you will build

In this codelab, you will theme an email client app called Reply.
and support dark themes.



If you run the app now, you should see app previews with the imported theme colors instead of t
he baseline theme

To apply the new theme in MainActivity.kt, wrap the main composable RepyApp with the main
theming function, AppTheme().

You'll also update the preview functions to see the them applied to app previews. Wrap the 
Replyapp composable inside ReplyAppPreview() withinn the AppTheme to

Large FAB without any theming applied(Left)

Themed large FAB with tertiary color

You can see that , just by providing background, you have clear separation between the tonal 
surface and the list item

Material Design 3 defines a type scale. The naming and grouping have been simplifid to:
display, headline, title, body, and label, with large, medium, and small sizes for each.

YOu'll ue five typography styles in your app: headlineSmall, titleLarge, bodyLarge,
bodyMedium, and labelMedium.
#### typography
#### Definign shapes
Compose provides Shapes class of different sizes of shapes :
Extra Small Medium Large Extra large.

Create a new file Shape.kt add code:
```kotlin
val shapes = Shapes()
```

pass it to MaterialTheme
```kotlin
MaterialTheme(
    colorScheme = colors,
    typography = typography,
    shapes = shapes,
    content = content
)
```
```kotlin
fun ReplyAppContent(
    Column(){
        ReplyInboxScreen
        EmptyComingSoon
        navigataionBar(){
            NavigationItem(){
                Icon
            }
        }
}
)
```
```kotlin
ReplyInboxScreen(
    
){
    Box(){
        ReplyEmailListContent()
        LargeFloatingButton(){
            Icon
        }
    }
}
```
```kotlin

```

ReplyAppContent(){

# Emphasis
For example, surface can be used with on-surface-variant, and surface-variant van be used 
with on-surface to provide different levels of emphasis.

Using different font weights for text. As custon weights to scale for 
providing different emphasis.

Next, update ReplyEmailListItem . By default, the content on
background.

You'll update the time text and body text composable's color , applied to
subject and title text.


Android 10
Mars 
Android Google C++
Android 12
Android
2013
10
10 Android
10 10
2012
2012
C
C
996
996
2013 3
offer
996
10
CSDN
166
1200
80000+
24000+
17000+
2013 2014 2015
2014
Android 1
2015
81000
8
2
2016
2017
2 16
1
2020
Android 3
6
2016
CSDN
6
6
1600
100
102018
leetcode 
600
7
10
Android
2002
11
Kotlin Flow
1
PermissionX
Edge 3 5
9 4 5
10 Android Android 10

LLMs Llama3: Llama-3 Llama-3
2024 8 Meta Meta Llama 3 Meta Meta Llama 3 Llama 3 Transformer
SFT RLHF
Meta AI
Meta Llama 3 
8B 70B Llama 3 Llama 3 15
1000 Meta 15T token Llama 2 7
Transformer token
10k GPU
AWS GF HU
Llama Guard
Meta Llama 3 Meta
Meta 2023 2 25 Llama 1 2023 7 18 Meta Llama2 ChatGLM3 3 Llama3 Llama 3 10 2024 4 18
Open OpenAI Meta AIGC AIGC
Llama AI Respect

LLMs LLaMA : LLaMa 
LLMs Llama3: :;ama3
Llama 3
Llama 3
1800 12
15 token Llama 3 3D 16K GPU
Llama 3: tokenizer GQA
Llama 3 
Meta Llama 3
Benchmarks
Llama 3
24G 10G
Hugging Face
ModelScope 15G
ChatFormat
Colab LLaMA-Factory unsloth LLaMA-Factory unsloth Colab GPT4ALL


Meet Your New Assistant: Meta AI, built with Llama 3
Takeaways
A better assistant: Thanks to or latest advances with Meta Llama3 , we believe Meta AI is now the
most intelligent AI assistant you can use for free and it's avialbale in more countries across our 
apps to help you plan dinner based on what's in your fridge, study for your test and so much more.

More info: You can use Meta AI in feed, chats, search and more across our apps to get things done 
and access real-time information, without having to leave the app you're using

Faster images: Meta AI's image generation is now faster, producing images as you tye, so you can 
create album artwork for your band, decor inspiration foryour apartment, animated custom GIs and more

Built with Meta Llama3, Meta AI is one of the world's leading AI assiatants, already on yout phone,
in your pocket for free. And 
