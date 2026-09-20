.class public final enum Lxp8;
.super Ljava/lang/Enum;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final enum A:Lxp8;

.field public static final enum B:Lxp8;

.field public static final enum C:Lxp8;

.field public static final enum D:Lxp8;

.field public static final enum E:Lxp8;

.field public static final enum F:Lxp8;

.field public static final synthetic G:[Lxp8;

.field public static final enum x:Lxp8;

.field public static final enum y:Lxp8;

.field public static final enum z:Lxp8;


# instance fields
.field public final w:C


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lxp8;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x30

    .line 5
    .line 6
    const-string v3, "UNSET"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lxp8;-><init>(Ljava/lang/String;IC)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lxp8;->x:Lxp8;

    .line 12
    .line 13
    new-instance v1, Lxp8;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const/16 v3, 0x31

    .line 17
    .line 18
    const-string v4, "REMOTE_DEFAULT"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lxp8;-><init>(Ljava/lang/String;IC)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lxp8;->y:Lxp8;

    .line 24
    .line 25
    new-instance v2, Lxp8;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const/16 v4, 0x32

    .line 29
    .line 30
    const-string v5, "REMOTE_DELEGATION"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, Lxp8;-><init>(Ljava/lang/String;IC)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lxp8;->z:Lxp8;

    .line 36
    .line 37
    new-instance v3, Lxp8;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const/16 v5, 0x33

    .line 41
    .line 42
    const-string v6, "MANIFEST"

    .line 43
    .line 44
    invoke-direct {v3, v6, v4, v5}, Lxp8;-><init>(Ljava/lang/String;IC)V

    .line 45
    .line 46
    .line 47
    sput-object v3, Lxp8;->A:Lxp8;

    .line 48
    .line 49
    new-instance v4, Lxp8;

    .line 50
    .line 51
    const/4 v5, 0x4

    .line 52
    const/16 v6, 0x34

    .line 53
    .line 54
    const-string v7, "INITIALIZATION"

    .line 55
    .line 56
    invoke-direct {v4, v7, v5, v6}, Lxp8;-><init>(Ljava/lang/String;IC)V

    .line 57
    .line 58
    .line 59
    sput-object v4, Lxp8;->B:Lxp8;

    .line 60
    .line 61
    new-instance v5, Lxp8;

    .line 62
    .line 63
    const/4 v6, 0x5

    .line 64
    const/16 v7, 0x35

    .line 65
    .line 66
    const-string v8, "API"

    .line 67
    .line 68
    invoke-direct {v5, v8, v6, v7}, Lxp8;-><init>(Ljava/lang/String;IC)V

    .line 69
    .line 70
    .line 71
    sput-object v5, Lxp8;->C:Lxp8;

    .line 72
    .line 73
    new-instance v6, Lxp8;

    .line 74
    .line 75
    const/4 v7, 0x6

    .line 76
    const/16 v8, 0x36

    .line 77
    .line 78
    const-string v9, "CHILD_ACCOUNT"

    .line 79
    .line 80
    invoke-direct {v6, v9, v7, v8}, Lxp8;-><init>(Ljava/lang/String;IC)V

    .line 81
    .line 82
    .line 83
    new-instance v7, Lxp8;

    .line 84
    .line 85
    const/4 v8, 0x7

    .line 86
    const/16 v9, 0x37

    .line 87
    .line 88
    const-string v10, "TCF"

    .line 89
    .line 90
    invoke-direct {v7, v10, v8, v9}, Lxp8;-><init>(Ljava/lang/String;IC)V

    .line 91
    .line 92
    .line 93
    sput-object v7, Lxp8;->D:Lxp8;

    .line 94
    .line 95
    new-instance v8, Lxp8;

    .line 96
    .line 97
    const/16 v9, 0x8

    .line 98
    .line 99
    const/16 v10, 0x38

    .line 100
    .line 101
    const-string v11, "REMOTE_ENFORCED_DEFAULT"

    .line 102
    .line 103
    invoke-direct {v8, v11, v9, v10}, Lxp8;-><init>(Ljava/lang/String;IC)V

    .line 104
    .line 105
    .line 106
    sput-object v8, Lxp8;->E:Lxp8;

    .line 107
    .line 108
    new-instance v9, Lxp8;

    .line 109
    .line 110
    const/16 v10, 0x9

    .line 111
    .line 112
    const/16 v11, 0x39

    .line 113
    .line 114
    const-string v12, "FAILSAFE"

    .line 115
    .line 116
    invoke-direct {v9, v12, v10, v11}, Lxp8;-><init>(Ljava/lang/String;IC)V

    .line 117
    .line 118
    .line 119
    sput-object v9, Lxp8;->F:Lxp8;

    .line 120
    .line 121
    filled-new-array/range {v0 .. v9}, [Lxp8;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    sput-object v0, Lxp8;->G:[Lxp8;

    .line 126
    .line 127
    return-void
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

.method public constructor <init>(Ljava/lang/String;IC)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-char p3, p0, Lxp8;->w:C

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

.method public static values()[Lxp8;
    .locals 1

    .line 1
    sget-object v0, Lxp8;->G:[Lxp8;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lxp8;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lxp8;

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
