.class public abstract Loa7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Z

.field public static final b:Z

.field public static final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    :try_start_0
    const-string v0, "kotlin.reflect.jvm.useK1Implementation"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    new-instance v1, Lm66;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Lm66;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    move-object v0, v1

    .line 15
    :goto_0
    nop

    .line 16
    instance-of v1, v0, Lm66;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    move-object v0, v2

    .line 22
    :cond_0
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v3, 0x1

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-ne v0, v3, :cond_1

    .line 33
    .line 34
    move v0, v3

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v0, v1

    .line 37
    :goto_1
    sput-boolean v0, Loa7;->a:Z

    .line 38
    .line 39
    :try_start_1
    const-string v0, "kotlin.reflect.jvm.newFakeOverridesImplementation"

    .line 40
    .line 41
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 45
    goto :goto_2

    .line 46
    :catchall_1
    move-exception v0

    .line 47
    new-instance v4, Lm66;

    .line 48
    .line 49
    invoke-direct {v4, v0}, Lm66;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object v0, v4

    .line 53
    :goto_2
    nop

    .line 54
    instance-of v4, v0, Lm66;

    .line 55
    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    move-object v0, v2

    .line 59
    :cond_2
    check-cast v0, Ljava/lang/String;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-ne v0, v3, :cond_3

    .line 68
    .line 69
    move v0, v3

    .line 70
    goto :goto_3

    .line 71
    :cond_3
    move v0, v1

    .line 72
    :goto_3
    sput-boolean v0, Loa7;->b:Z

    .line 73
    .line 74
    :try_start_2
    const-string v0, "kotlin.reflect.jvm.loadMetadataDirectly"

    .line 75
    .line 76
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 80
    goto :goto_4

    .line 81
    :catchall_2
    move-exception v0

    .line 82
    new-instance v4, Lm66;

    .line 83
    .line 84
    invoke-direct {v4, v0}, Lm66;-><init>(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    move-object v0, v4

    .line 88
    :goto_4
    nop

    .line 89
    instance-of v4, v0, Lm66;

    .line 90
    .line 91
    if-eqz v4, :cond_4

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_4
    move-object v2, v0

    .line 95
    :goto_5
    check-cast v2, Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v2, :cond_5

    .line 98
    .line 99
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-ne v0, v3, :cond_5

    .line 104
    .line 105
    move v1, v3

    .line 106
    :cond_5
    sput-boolean v1, Loa7;->c:Z

    .line 107
    .line 108
    return-void
    .line 109
    .line 110
    .line 111
    .line 112
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
