.class public final enum Lmm;
.super Ljava/lang/Enum;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final enum A:Lmm;

.field public static final enum B:Lmm;

.field public static final enum C:Lmm;

.field public static final enum D:Lmm;

.field public static final enum E:Lmm;

.field public static final enum F:Lmm;

.field public static final synthetic G:[Lmm;

.field public static final enum x:Lmm;

.field public static final enum y:Lmm;

.field public static final enum z:Lmm;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lmm;

    .line 2
    .line 3
    const-string v1, "ALL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lmm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lmm;

    .line 11
    .line 12
    const-string v2, "FIELD"

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    invoke-direct {v1, v2, v4, v3}, Lmm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sput-object v1, Lmm;->x:Lmm;

    .line 19
    .line 20
    new-instance v2, Lmm;

    .line 21
    .line 22
    const-string v4, "FILE"

    .line 23
    .line 24
    const/4 v5, 0x2

    .line 25
    invoke-direct {v2, v4, v5, v3}, Lmm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sput-object v2, Lmm;->y:Lmm;

    .line 29
    .line 30
    move-object v4, v3

    .line 31
    new-instance v3, Lmm;

    .line 32
    .line 33
    const-string v5, "PROPERTY"

    .line 34
    .line 35
    const/4 v6, 0x3

    .line 36
    invoke-direct {v3, v5, v6, v4}, Lmm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lmm;->z:Lmm;

    .line 40
    .line 41
    move-object v5, v4

    .line 42
    new-instance v4, Lmm;

    .line 43
    .line 44
    const/4 v6, 0x4

    .line 45
    const-string v7, "get"

    .line 46
    .line 47
    const-string v8, "PROPERTY_GETTER"

    .line 48
    .line 49
    invoke-direct {v4, v8, v6, v7}, Lmm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sput-object v4, Lmm;->A:Lmm;

    .line 53
    .line 54
    move-object v6, v5

    .line 55
    new-instance v5, Lmm;

    .line 56
    .line 57
    const/4 v7, 0x5

    .line 58
    const-string v8, "set"

    .line 59
    .line 60
    const-string v9, "PROPERTY_SETTER"

    .line 61
    .line 62
    invoke-direct {v5, v9, v7, v8}, Lmm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    sput-object v5, Lmm;->B:Lmm;

    .line 66
    .line 67
    move-object v7, v6

    .line 68
    new-instance v6, Lmm;

    .line 69
    .line 70
    const-string v8, "RECEIVER"

    .line 71
    .line 72
    const/4 v9, 0x6

    .line 73
    invoke-direct {v6, v8, v9, v7}, Lmm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sput-object v6, Lmm;->C:Lmm;

    .line 77
    .line 78
    new-instance v7, Lmm;

    .line 79
    .line 80
    const/4 v8, 0x7

    .line 81
    const-string v9, "param"

    .line 82
    .line 83
    const-string v10, "CONSTRUCTOR_PARAMETER"

    .line 84
    .line 85
    invoke-direct {v7, v10, v8, v9}, Lmm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    sput-object v7, Lmm;->D:Lmm;

    .line 89
    .line 90
    new-instance v8, Lmm;

    .line 91
    .line 92
    const/16 v9, 0x8

    .line 93
    .line 94
    const-string v10, "setparam"

    .line 95
    .line 96
    const-string v11, "SETTER_PARAMETER"

    .line 97
    .line 98
    invoke-direct {v8, v11, v9, v10}, Lmm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    sput-object v8, Lmm;->E:Lmm;

    .line 102
    .line 103
    new-instance v9, Lmm;

    .line 104
    .line 105
    const/16 v10, 0x9

    .line 106
    .line 107
    const-string v11, "delegate"

    .line 108
    .line 109
    const-string v12, "PROPERTY_DELEGATE_FIELD"

    .line 110
    .line 111
    invoke-direct {v9, v12, v10, v11}, Lmm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 112
    .line 113
    .line 114
    sput-object v9, Lmm;->F:Lmm;

    .line 115
    .line 116
    filled-new-array/range {v0 .. v9}, [Lmm;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sput-object v0, Lmm;->G:[Lmm;

    .line 121
    .line 122
    return-void
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    if-nez p3, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    :cond_0
    iput-object p3, p0, Lmm;->w:Ljava/lang/String;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method

.method public static valueOf(Ljava/lang/String;)Lmm;
    .locals 1

    .line 1
    const-class v0, Lmm;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lmm;

    .line 8
    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static values()[Lmm;
    .locals 1

    .line 1
    sget-object v0, Lmm;->G:[Lmm;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lmm;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
