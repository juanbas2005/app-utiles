.class public abstract La18;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lp64;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-wide v2, 0xff12557aL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v2, v3}, Luq3;->d(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    new-instance v4, Ljt0;

    .line 16
    .line 17
    invoke-direct {v4, v2, v3}, Ljt0;-><init>(J)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Lyb5;

    .line 21
    .line 22
    invoke-direct {v2, v1, v4}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    const/high16 v1, 0x3f800000    # 1.0f

    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-wide v3, 0xff1668a8L

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v3, v4}, Luq3;->d(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    new-instance v5, Ljt0;

    .line 41
    .line 42
    invoke-direct {v5, v3, v4}, Ljt0;-><init>(J)V

    .line 43
    .line 44
    .line 45
    new-instance v3, Lyb5;

    .line 46
    .line 47
    invoke-direct {v3, v1, v5}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    filled-new-array {v2, v3}, [Lyb5;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const/4 v2, 0x2

    .line 55
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, [Lyb5;

    .line 60
    .line 61
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    int-to-long v2, v2

    .line 66
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    int-to-long v4, v4

    .line 71
    const/16 v6, 0x20

    .line 72
    .line 73
    shl-long/2addr v2, v6

    .line 74
    const-wide v7, 0xffffffffL

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    and-long/2addr v4, v7

    .line 80
    or-long v12, v2, v4

    .line 81
    .line 82
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 83
    .line 84
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    int-to-long v2, v2

    .line 89
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    int-to-long v4, v0

    .line 94
    shl-long/2addr v2, v6

    .line 95
    and-long/2addr v4, v7

    .line 96
    or-long v14, v2, v4

    .line 97
    .line 98
    array-length v0, v1

    .line 99
    new-instance v10, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 102
    .line 103
    .line 104
    const/4 v2, 0x0

    .line 105
    move v3, v2

    .line 106
    :goto_0
    if-ge v3, v0, :cond_0

    .line 107
    .line 108
    aget-object v4, v1, v3

    .line 109
    .line 110
    iget-object v4, v4, Lyb5;->x:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v4, Ljt0;

    .line 113
    .line 114
    iget-wide v4, v4, Ljt0;->a:J

    .line 115
    .line 116
    new-instance v6, Ljt0;

    .line 117
    .line 118
    invoke-direct {v6, v4, v5}, Ljt0;-><init>(J)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    add-int/lit8 v3, v3, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_0
    array-length v0, v1

    .line 128
    new-instance v11, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v11, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 131
    .line 132
    .line 133
    :goto_1
    if-ge v2, v0, :cond_1

    .line 134
    .line 135
    aget-object v3, v1, v2

    .line 136
    .line 137
    iget-object v3, v3, Lyb5;->w:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v3, Ljava/lang/Number;

    .line 140
    .line 141
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    add-int/lit8 v2, v2, 0x1

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_1
    new-instance v9, Lp64;

    .line 156
    .line 157
    invoke-direct/range {v9 .. v15}, Lp64;-><init>(Ljava/util/List;Ljava/util/List;JJ)V

    .line 158
    .line 159
    .line 160
    sput-object v9, La18;->a:Lp64;

    .line 161
    .line 162
    return-void
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
