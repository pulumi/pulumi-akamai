// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetIamPasswordPolicy
    {
        public static Task<GetIamPasswordPolicyResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIamPasswordPolicyResult>("akamai:index/getIamPasswordPolicy:getIamPasswordPolicy", InvokeArgs.Empty, options.WithDefaults());

        public static Output<GetIamPasswordPolicyResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIamPasswordPolicyResult>("akamai:index/getIamPasswordPolicy:getIamPasswordPolicy", InvokeArgs.Empty, options.WithDefaults());

        public static Output<GetIamPasswordPolicyResult> Invoke(InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetIamPasswordPolicyResult>("akamai:index/getIamPasswordPolicy:getIamPasswordPolicy", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetIamPasswordPolicyResult
    {
        public readonly int CaseDif;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly int MaxRepeating;
        public readonly int MinDigits;
        public readonly int MinLength;
        public readonly int MinLetters;
        public readonly int MinNonAlpha;
        public readonly int MinReuse;
        public readonly string PwClass;
        public readonly int RotateFrequency;

        [OutputConstructor]
        private GetIamPasswordPolicyResult(
            int caseDif,

            string id,

            int maxRepeating,

            int minDigits,

            int minLength,

            int minLetters,

            int minNonAlpha,

            int minReuse,

            string pwClass,

            int rotateFrequency)
        {
            CaseDif = caseDif;
            Id = id;
            MaxRepeating = maxRepeating;
            MinDigits = minDigits;
            MinLength = minLength;
            MinLetters = minLetters;
            MinNonAlpha = minNonAlpha;
            MinReuse = minReuse;
            PwClass = pwClass;
            RotateFrequency = rotateFrequency;
        }
    }
}
