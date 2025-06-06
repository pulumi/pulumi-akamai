// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetBotmanCustomBotCategoryItemSequence
    {
        public static Task<GetBotmanCustomBotCategoryItemSequenceResult> InvokeAsync(GetBotmanCustomBotCategoryItemSequenceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBotmanCustomBotCategoryItemSequenceResult>("akamai:index/getBotmanCustomBotCategoryItemSequence:getBotmanCustomBotCategoryItemSequence", args ?? new GetBotmanCustomBotCategoryItemSequenceArgs(), options.WithDefaults());

        public static Output<GetBotmanCustomBotCategoryItemSequenceResult> Invoke(GetBotmanCustomBotCategoryItemSequenceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBotmanCustomBotCategoryItemSequenceResult>("akamai:index/getBotmanCustomBotCategoryItemSequence:getBotmanCustomBotCategoryItemSequence", args ?? new GetBotmanCustomBotCategoryItemSequenceInvokeArgs(), options.WithDefaults());

        public static Output<GetBotmanCustomBotCategoryItemSequenceResult> Invoke(GetBotmanCustomBotCategoryItemSequenceInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetBotmanCustomBotCategoryItemSequenceResult>("akamai:index/getBotmanCustomBotCategoryItemSequence:getBotmanCustomBotCategoryItemSequence", args ?? new GetBotmanCustomBotCategoryItemSequenceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBotmanCustomBotCategoryItemSequenceArgs : global::Pulumi.InvokeArgs
    {
        [Input("categoryId", required: true)]
        public string CategoryId { get; set; } = null!;

        [Input("configId", required: true)]
        public int ConfigId { get; set; }

        public GetBotmanCustomBotCategoryItemSequenceArgs()
        {
        }
        public static new GetBotmanCustomBotCategoryItemSequenceArgs Empty => new GetBotmanCustomBotCategoryItemSequenceArgs();
    }

    public sealed class GetBotmanCustomBotCategoryItemSequenceInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("categoryId", required: true)]
        public Input<string> CategoryId { get; set; } = null!;

        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        public GetBotmanCustomBotCategoryItemSequenceInvokeArgs()
        {
        }
        public static new GetBotmanCustomBotCategoryItemSequenceInvokeArgs Empty => new GetBotmanCustomBotCategoryItemSequenceInvokeArgs();
    }


    [OutputType]
    public sealed class GetBotmanCustomBotCategoryItemSequenceResult
    {
        public readonly ImmutableArray<string> BotIds;
        public readonly string CategoryId;
        public readonly int ConfigId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetBotmanCustomBotCategoryItemSequenceResult(
            ImmutableArray<string> botIds,

            string categoryId,

            int configId,

            string id)
        {
            BotIds = botIds;
            CategoryId = categoryId;
            ConfigId = configId;
            Id = id;
        }
    }
}
