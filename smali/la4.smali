.class public abstract Lla4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lyy0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lq83;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq83;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lyy0;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lyy0;-><init>(Lsr2;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lla4;->a:Lyy0;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static a(Lyt2;)Lw45;
    .locals 5

    .line 1
    sget-object v0, Lla4;->a:Lyy0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lw45;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    const v0, 0x48071ead

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lyt2;->e0(I)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lye;->f:Lt37;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/view/View;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    :goto_0
    if-eqz v0, :cond_3

    .line 31
    .line 32
    const v3, 0x7f090237

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    instance-of v4, v3, Lw45;

    .line 40
    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    check-cast v3, Lw45;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    move-object v3, v1

    .line 47
    :goto_1
    if-eqz v3, :cond_1

    .line 48
    .line 49
    move-object v0, v3

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    invoke-static {v0}, Lz85;->k(Landroid/view/View;)Landroid/view/ViewParent;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    instance-of v3, v0, Landroid/view/View;

    .line 56
    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    check-cast v0, Landroid/view/View;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move-object v0, v1

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    move-object v0, v1

    .line 65
    :goto_2
    invoke-virtual {p0, v2}, Lyt2;->r(Z)V

    .line 66
    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const v3, 0x4807151c

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v3}, Lyt2;->e0(I)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :goto_3
    if-nez v0, :cond_7

    .line 77
    .line 78
    const v0, 0x48072680    # 138394.0f

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lyt2;->e0(I)V

    .line 82
    .line 83
    .line 84
    sget-object v0, Lye;->b:Lt37;

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Landroid/content/Context;

    .line 91
    .line 92
    :goto_4
    instance-of v3, v0, Landroid/content/ContextWrapper;

    .line 93
    .line 94
    if-eqz v3, :cond_6

    .line 95
    .line 96
    instance-of v3, v0, Lw45;

    .line 97
    .line 98
    if-eqz v3, :cond_5

    .line 99
    .line 100
    move-object v1, v0

    .line 101
    goto :goto_5

    .line 102
    :cond_5
    check-cast v0, Landroid/content/ContextWrapper;

    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    goto :goto_4

    .line 109
    :cond_6
    :goto_5
    check-cast v1, Lw45;

    .line 110
    .line 111
    invoke-virtual {p0, v2}, Lyt2;->r(Z)V

    .line 112
    .line 113
    .line 114
    return-object v1

    .line 115
    :cond_7
    const v1, 0x4807156d

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v1}, Lyt2;->e0(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v2}, Lyt2;->r(Z)V

    .line 122
    .line 123
    .line 124
    return-object v0
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
.end method
