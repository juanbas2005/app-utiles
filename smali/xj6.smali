.class public abstract Lxj6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lll;

.field public static final b:Llo7;

.field public static final c:J

.field public static final d:Lx17;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lll;

    .line 2
    .line 3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 4
    .line 5
    invoke-direct {v0, v1, v1}, Lll;-><init>(FF)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lxj6;->a:Lll;

    .line 9
    .line 10
    new-instance v0, Lnf6;

    .line 11
    .line 12
    const/16 v1, 0xe

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lnf6;-><init>(I)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lnf6;

    .line 18
    .line 19
    const/16 v2, 0xf

    .line 20
    .line 21
    invoke-direct {v1, v2}, Lnf6;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v2, Llo7;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Llo7;-><init>(Lvr2;Lvr2;)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lxj6;->b:Llo7;

    .line 30
    .line 31
    const v0, 0x3c23d70a    # 0.01f

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    int-to-long v1, v1

    .line 39
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    int-to-long v3, v0

    .line 44
    const/16 v0, 0x20

    .line 45
    .line 46
    shl-long v0, v1, v0

    .line 47
    .line 48
    const-wide v5, 0xffffffffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    and-long v2, v3, v5

    .line 54
    .line 55
    or-long/2addr v0, v2

    .line 56
    sput-wide v0, Lxj6;->c:J

    .line 57
    .line 58
    new-instance v2, Lx17;

    .line 59
    .line 60
    new-instance v3, Ll35;

    .line 61
    .line 62
    invoke-direct {v3, v0, v1}, Ll35;-><init>(J)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v2, v3}, Lx17;-><init>(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sput-object v2, Lxj6;->d:Lx17;

    .line 69
    .line 70
    return-void
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
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
