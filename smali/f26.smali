.class public final Lf26;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final d:Lhr2;

.field public static final synthetic e:[Lyr3;


# instance fields
.field public final a:Lam6;

.field public final b:Lnz3;

.field public final c:Ls63;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lgr5;

    .line 2
    .line 3
    const-class v1, Lf26;

    .line 4
    .line 5
    const-string v2, "kClass"

    .line 6
    .line 7
    const-string v3, "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lgr5;

    .line 14
    .line 15
    const-string v3, "kProperty"

    .line 16
    .line 17
    const-string v5, "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Lgr5;

    .line 23
    .line 24
    const-string v5, "kProperty0"

    .line 25
    .line 26
    const-string v6, "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, Lgr5;

    .line 32
    .line 33
    const-string v6, "kProperty1"

    .line 34
    .line 35
    const-string v7, "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, Lgr5;

    .line 41
    .line 42
    const-string v7, "kProperty2"

    .line 43
    .line 44
    const-string v8, "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v7, Lgr5;

    .line 50
    .line 51
    const-string v8, "kMutableProperty0"

    .line 52
    .line 53
    const-string v9, "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    .line 54
    .line 55
    invoke-direct {v7, v1, v8, v9, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    new-instance v8, Lgr5;

    .line 59
    .line 60
    const-string v9, "kMutableProperty1"

    .line 61
    .line 62
    const-string v10, "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    .line 63
    .line 64
    invoke-direct {v8, v1, v9, v10, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    new-instance v9, Lgr5;

    .line 68
    .line 69
    const-string v10, "kMutableProperty2"

    .line 70
    .line 71
    const-string v11, "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    .line 72
    .line 73
    invoke-direct {v9, v1, v10, v11, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    const/16 v1, 0x8

    .line 77
    .line 78
    new-array v10, v1, [Lyr3;

    .line 79
    .line 80
    aput-object v0, v10, v4

    .line 81
    .line 82
    const/4 v0, 0x1

    .line 83
    aput-object v2, v10, v0

    .line 84
    .line 85
    const/4 v0, 0x2

    .line 86
    aput-object v3, v10, v0

    .line 87
    .line 88
    const/4 v0, 0x3

    .line 89
    aput-object v5, v10, v0

    .line 90
    .line 91
    const/4 v0, 0x4

    .line 92
    aput-object v6, v10, v0

    .line 93
    .line 94
    const/4 v0, 0x5

    .line 95
    aput-object v7, v10, v0

    .line 96
    .line 97
    const/4 v0, 0x6

    .line 98
    aput-object v8, v10, v0

    .line 99
    .line 100
    const/4 v0, 0x7

    .line 101
    aput-object v9, v10, v0

    .line 102
    .line 103
    sput-object v10, Lf26;->e:[Lyr3;

    .line 104
    .line 105
    new-instance v0, Lhr2;

    .line 106
    .line 107
    invoke-direct {v0, v1}, Lhr2;-><init>(I)V

    .line 108
    .line 109
    .line 110
    sput-object v0, Lf26;->d:Lhr2;

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

.method public constructor <init>(Ltl4;Lam6;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lf26;->a:Lam6;

    .line 5
    .line 6
    new-instance p2, Lsn3;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p2, p1, v0}, Lsn3;-><init>(Ltl4;I)V

    .line 10
    .line 11
    .line 12
    sget-object p1, Li44;->w:Li44;

    .line 13
    .line 14
    invoke-static {p1, p2}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lf26;->b:Lnz3;

    .line 19
    .line 20
    new-instance p1, Ls63;

    .line 21
    .line 22
    const/4 p2, 0x7

    .line 23
    invoke-direct {p1, p2}, Ls63;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lf26;->c:Ls63;

    .line 27
    .line 28
    return-void
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
.end method
