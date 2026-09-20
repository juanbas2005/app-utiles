.class public final enum Lgv3;
.super Ljava/lang/Enum;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final enum A:Lgv3;

.field public static final enum B:Lgv3;

.field public static final enum C:Lgv3;

.field public static final enum D:Lgv3;

.field public static final enum E:Lgv3;

.field public static final synthetic F:[Lgv3;

.field public static final x:Ltz2;

.field public static final y:Ljava/util/LinkedHashMap;

.field public static final enum z:Lgv3;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lgv3;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const-string v1, "UNKNOWN"

    .line 5
    .line 6
    invoke-direct {v0, v6, v6, v1}, Lgv3;-><init>(IILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lgv3;->z:Lgv3;

    .line 10
    .line 11
    new-instance v1, Lgv3;

    .line 12
    .line 13
    const-string v2, "CLASS"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v3, v3, v2}, Lgv3;-><init>(IILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lgv3;->A:Lgv3;

    .line 20
    .line 21
    new-instance v2, Lgv3;

    .line 22
    .line 23
    const/4 v7, 0x2

    .line 24
    const-string v3, "FILE_FACADE"

    .line 25
    .line 26
    invoke-direct {v2, v7, v7, v3}, Lgv3;-><init>(IILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lgv3;->B:Lgv3;

    .line 30
    .line 31
    new-instance v3, Lgv3;

    .line 32
    .line 33
    const-string v4, "SYNTHETIC_CLASS"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v5, v5, v4}, Lgv3;-><init>(IILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lgv3;->C:Lgv3;

    .line 40
    .line 41
    new-instance v4, Lgv3;

    .line 42
    .line 43
    const-string v5, "MULTIFILE_CLASS"

    .line 44
    .line 45
    const/4 v8, 0x4

    .line 46
    invoke-direct {v4, v8, v8, v5}, Lgv3;-><init>(IILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sput-object v4, Lgv3;->D:Lgv3;

    .line 50
    .line 51
    new-instance v5, Lgv3;

    .line 52
    .line 53
    const-string v8, "MULTIFILE_CLASS_PART"

    .line 54
    .line 55
    const/4 v9, 0x5

    .line 56
    invoke-direct {v5, v9, v9, v8}, Lgv3;-><init>(IILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v5, Lgv3;->E:Lgv3;

    .line 60
    .line 61
    filled-new-array/range {v0 .. v5}, [Lgv3;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lgv3;->F:[Lgv3;

    .line 66
    .line 67
    new-instance v0, Ltz2;

    .line 68
    .line 69
    invoke-direct {v0, v7}, Ltz2;-><init>(I)V

    .line 70
    .line 71
    .line 72
    sput-object v0, Lgv3;->x:Ltz2;

    .line 73
    .line 74
    invoke-static {}, Lgv3;->values()[Lgv3;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    array-length v1, v0

    .line 79
    invoke-static {v1}, Ltf4;->F(I)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    const/16 v2, 0x10

    .line 84
    .line 85
    if-ge v1, v2, :cond_0

    .line 86
    .line 87
    move v1, v2

    .line 88
    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 89
    .line 90
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 91
    .line 92
    .line 93
    array-length v1, v0

    .line 94
    :goto_0
    if-ge v6, v1, :cond_1

    .line 95
    .line 96
    aget-object v3, v0, v6

    .line 97
    .line 98
    iget v4, v3, Lgv3;->w:I

    .line 99
    .line 100
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    add-int/lit8 v6, v6, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    sput-object v2, Lgv3;->y:Ljava/util/LinkedHashMap;

    .line 111
    .line 112
    return-void
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
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

.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lgv3;->w:I

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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

.method public static valueOf(Ljava/lang/String;)Lgv3;
    .locals 1

    .line 1
    const-class v0, Lgv3;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lgv3;

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

.method public static values()[Lgv3;
    .locals 1

    .line 1
    sget-object v0, Lgv3;->F:[Lgv3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lgv3;

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
