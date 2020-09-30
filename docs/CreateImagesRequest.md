

# CreateImagesRequest

Source image dictionary (transfers a remote image)
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | **String** | Used for export (optional) |  [optional]
**_public** | **Boolean** | Whether the image can be downloaded by untrusted users (defaults to false) |  [optional]
**autoUpdate** | **Boolean** | Whether the image should be auto-updated (optional; defaults to false) |  [optional]
**properties** | [**Properties3**](Properties3.md) |  |  [optional]
**aliases** | [**List&lt;Aliases&gt;**](Aliases.md) | Set initial aliases (\&quot;image_create_aliases\&quot; API extension) | 
**source** | [**Source10**](Source10.md) |  | 
**compressionAlgorithm** | **String** | Override the compression algorithm for the image (optional) |  [optional]



