# Zhongtai Common Java

zhongtai-common-java is a Java library which includes all definition elements of zhongtai framework.

## Installation

### maven

```xml
<dependency>
    <groupId>com.thoughtworks.zhongtai.automation</groupId>
    <artifactId>zhongtai-common-java</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

### gradle

```groovy
dependencies {
    implementation group: 'com.thoughtworks.zhongtai.automation', name: 'zhongtai-common-java', version: '1.0-SNAPSHOT'
}
```

### other

```
```

## Usage

```java
import com.thoughtworks.zhongtai.automation.common.zhongtai.*;

@Solution(
        name = "渠道中台线上贷解决方案",
        description = "增加“贷款意向申请”、“申请贷款担保额度”、“贷款担保”等业务活动、业务服务、能力项与能力组件",
        requirementType = SolutionRequirementType.MODIFY
)
class CreateOrderAbility {
    //... 
}
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)