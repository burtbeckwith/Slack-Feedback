Slack Feedback
=========

Chat box for quick app feedback sent to a Slack channel from a Grails project.

## Requirements

- Slack account with Incoming WebHooks integration
- jQuery
- Semantic UI
	- *Currently **Slack Feedback** only supports use with the **Semantic UI** frontend framework*

## Setup

### Slack

- Create an [Incoming WebHooks integration](https://my.slack.com/services/new/incoming-webhook)
- Select a channel to post messages to
	- **NOTE:** This can be overwritten in the config. This is helpful if multiple projects use the same webhook.
- Add the WebHook url to the config as shown below

### Config

All config items contain the prefix **grails.plugin.slackfeedback.**

**NOTE:** Config items with * after them are secret information. It is highly reccommended to put this information in secret files and pull it into the Grails project at runtime.

- **webhook** - The WebHook URL provided by Slack*
- **channel** - The channel to post to [Optional]

## Use

**Slack Feedback** provides a single layout template which contains all necessary HTML and JavaScript. A basic use of the layout is below:

```
<g:render template="/layouts/chatbox" plugin="slack-feedback" />
```

To trigger the modals contined within the template call the JavaScript function `slackFeedback()`. A simple button which does this is shown below and can be placed anywhere on a page:

```
<div class="ui primary button" onclick="slackFeedback()">Feedback</div>
```

### Parameters

The **chatbox** template takes multiple optional parameters which customize the modals. These are passed in `model` attribute as a map. An example is shown below:

```
<g:render template="/layouts/chatbox" plugin="slack-feedback" model="[title: 'Need help or have some feedback?', maxlength: 1000]" />
```

- **title** - The title of the form modal
	- **Default:** 'Send Us A Comment'

- **label** - The label of the textarea
	- **Default:** 'Feedback'

- **placeholder** - Placeholder text for the textarea
	- **Default:** ''

- **maxlength** - Maximum character length of the textarea
	- **Default:** 255

- **successText** - Success modal title
	- **Default:** 'Feedback Successfully Sent'

- **errorText** - Error modal title
	- **Default:** 'An Error Occured, Please Try Again Later'